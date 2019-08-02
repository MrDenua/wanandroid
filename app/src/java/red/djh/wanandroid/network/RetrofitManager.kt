package red.djh.wanandroid.network

import android.content.Context
import okhttp3.OkHttpClient
import red.djh.wanandroid.api.SiteApi
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
class RetrofitManager private constructor(context: Context?, baseUrl: String) {

    private var mRetrofit: Retrofit

    init {

        val builder = OkHttpClient.Builder()
        builder.writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .addInterceptor(LogInterceptor())
            .connectTimeout(20, TimeUnit.SECONDS)

        val retrofitBuilder = Retrofit.Builder()
        retrofitBuilder.baseUrl(baseUrl)
            .client(builder.build())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())

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