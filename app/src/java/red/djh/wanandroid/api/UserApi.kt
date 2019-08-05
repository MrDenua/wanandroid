package red.djh.wanandroid.api

import io.reactivex.Observable
import red.djh.wanandroid.bean.Response
import red.djh.wanandroid.bean.user.LoginBean
import red.djh.wanandroid.dto.LoginDto
import red.djh.wanandroid.dto.RegisterDto
import red.djh.wanandroid.network.RetrofitManager
import retrofit2.http.*

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

    @POST("user/login")
    fun login(@Body loginDto: LoginDto): Observable<Response<LoginBean>>

    @POST("user/register")
    fun register(@Body registerDto: RegisterDto): Observable<Response<String>>

    @POST("user/login")
    fun login(@Body map:Map<String,String>): Observable<Response<LoginBean>>

    @GET("ser/logout/json")
    fun logout(): Observable<Response<String>>
}