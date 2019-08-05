package red.djh.wanandroid.network

import okhttp3.*
import okio.Buffer
import java.io.IOException


/**
 * red.djh.wanandroid.network
 *
 *
 * @author denua
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
class LogInterceptor(private val mLogger: NetworkLogger) : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        val originRequest = chain.request()
        if (mLogger.level != Logger.NONE) {
            logUrl(originRequest)
            logHeaders(originRequest)
            logParameter(originRequest)
        }

        val response = chain.proceed(originRequest)
        if (!response.isSuccessful) {
            mLogger.e(
                Logger.GENERAL, TAG, Exception(
                    "HTTP " + response.code() + " " + response.message()
                )
            )
            mLogger.e(Logger.GENERAL, TAG, Exception(response.body()!!.string()))
        }
        return response
    }

    private fun logParameter(request: Request) {

        var log = ""
        val requestBody = request.body() ?: return
        if (requestBody is FormBody) {
            val stringBuilder = StringBuilder()
            stringBuilder.append("{\n")
            val formBody = requestBody as FormBody
            val size = formBody.size()
            for (i in 0 until size) {
                stringBuilder.append("\t")
                    .append(formBody.name(i)).append(": ").append(formBody.value(i)).append(",")
                    .append("\n")
            }
            stringBuilder.append("}")
            log = stringBuilder.toString().replace("{\n}", "{}")
        } else if (TYPE_JSON == requestBody.contentType()) {
            val buffer = Buffer()
            try {
                requestBody.writeTo(buffer)
                log = buffer.readUtf8()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
        mLogger.i(Logger.REQUEST_BODY, TAG, "Request Parameters: $log")
    }

    private fun logUrl(request: Request) {

        mLogger.i(Logger.REQUEST_URL, TAG, request.method() + " " + request.url().toString())
    }

    private fun logHeaders(request: Request) {

        val headers = request.headers()
        val builder = StringBuilder()
        builder.append("Request Headers:\n")
        for (key in headers.names()) {
            builder.append(key)
                .append(" : ")
                .append(headers.get(key))
        }
        mLogger.i(Logger.REQUEST_HEADERS, TAG, builder.toString())
    }

    companion object {

        private val TAG = "LogInterceptor"
        private val TYPE_JSON = MediaType.get("application/json; charset=UTF-8")
    }
}