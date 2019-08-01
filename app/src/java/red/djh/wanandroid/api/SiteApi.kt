package red.djh.wanandroid.api

import io.reactivex.Observable
import red.djh.wanandroid.bean.ArticleBean
import red.djh.wanandroid.bean.PageBean
import red.djh.wanandroid.bean.Response
import red.djh.wanandroid.network.RetrofitManager
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * red.djh.wanandroid.api
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
interface SiteApi {

    @GET("article/list/{page}/json")
    fun getArticles(@Path("page") page: Int): Observable<Response<PageBean<ArticleBean>>>

    companion object {
        val API = RetrofitManager.create(SiteApi::class.java)
    }
}