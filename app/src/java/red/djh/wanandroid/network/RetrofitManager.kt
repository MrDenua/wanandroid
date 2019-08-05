package red.djh.wanandroid.network

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

/**
 * red.djh.wanandroid.network
 *
 *
 * @author denua
 * @email denua@foxmail.com
 * @date 2019/7/31
 */
class RetrofitManager private constructor(context: Context?, baseUrl: String) : NetworkLogger {

    override var level: Int
        get() = Logger.ALL
        set(value) {}

    override fun i(type: Int, tag: String, log: String) {
        println("$tag $log")
    }

    override fun e(type: Int, tag: String, log: Throwable) {
        println("$tag ${log.localizedMessage}")
        log.printStackTrace()
    }

    override fun isLogType(type: Int): Boolean {
        return type and level != 0
    }

    private var mRetrofit: Retrofit

    init {

        val builder = OkHttpClient.Builder()
        builder.writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .addInterceptor(LogInterceptor(this))
            .connectTimeout(20, TimeUnit.SECONDS)

        val retrofitBuilder = Retrofit.Builder()
        retrofitBuilder.baseUrl(baseUrl)
            .client(builder.build())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())

        mRetrofit = retrofitBuilder.build()

    }

    companion object {

        private lateinit var sInstance: RetrofitManager


        fun init(context: Context?, baseUrl: String) {
            sInstance = RetrofitManager(context, baseUrl)
        }

        fun <T> create(clazz: Class<T>): T = sInstance.mRetrofit.create(clazz)
    }
}