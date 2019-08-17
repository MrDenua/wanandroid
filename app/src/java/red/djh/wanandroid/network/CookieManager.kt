package red.djh.wanandroid.network

import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import java.util.*

/**
 * red.djh.wanandroid.network
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/17
 */
class CookieManager : CookieJar {

    private var mCookies: MutableMap<String, MutableList<Cookie>> = HashMap()

    override fun saveFromResponse(url: HttpUrl, cookies: MutableList<Cookie>) {
        mCookies[url.toString()] = cookies
    }

    override fun loadForRequest(url: HttpUrl): MutableList<Cookie>? {
        return mCookies[url.toString()]
    }
}