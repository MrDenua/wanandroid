package red.djh.wanandroid.api

import io.reactivex.Observable
import red.djh.wanandroid.bean.Response
import retrofit2.http.*

/**
 * red.djh.wanandroid.api
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/7
 */
interface CollectionApi {

    @POST("lg/collect/{id}/json")
    fun collect(@Path("id") articleId: Int): Observable<Result<Any>>

    @GET("lg/collect/list/{page}/json")
    fun collectionList(@Path("page") page: Int): Observable<Response<Any>>

    @POST("lg/collect/add/json")
    @FormUrlEncoded
    fun collect(@Field("title") title: String,
                @Field("author") author: String,
                @Field("link") link: String): Observable<Response<Any>>


}