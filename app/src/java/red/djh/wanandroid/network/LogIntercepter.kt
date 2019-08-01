package red.djh.wanandroid.network

import okhttp3.Interceptor
import okhttp3.Response
import red.djh.wanandroid.utils.LogUtils

/**
 * red.djh.wanandroid.network
 *
 *
 * @author denua
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
class LogInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        LogUtils.i(TAG, "${request.method()} ${request.url()}")
        return chain.proceed(request)
    }
    companion object{
        val TAG = "LogInterceptor"
    }
}