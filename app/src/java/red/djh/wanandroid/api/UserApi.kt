package red.djh.wanandroid.api

import io.reactivex.Observable
import red.djh.wanandroid.bean.Response
import red.djh.wanandroid.bean.user.UserBean
import red.djh.wanandroid.network.RetrofitManager
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/08/02 16:25
 * desc   :
 */
@Suppress("unused")
interface UserApi {

    object Instance {
        val API = RetrofitManager.create(UserApi::class.java)
    }

    @POST("user/register")
    @FormUrlEncoded
    fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    ): Observable<Response<UserBean>>

    @POST("user/login")
    @FormUrlEncoded
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Observable<Response<UserBean>>

    @GET("ser/logout/json")
    fun logout(): Observable<Response<String>>
}