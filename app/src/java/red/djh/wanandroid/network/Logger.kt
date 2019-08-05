package red.djh.wanandroid.network

import java.lang.Exception

/**
 * red.djh.wanandroid.network
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
interface Logger {

    fun i(tag: String, log: String)
    fun e(tag: String, e: Throwable)

    companion object {

        val ALL = 0x7fffffff
        val NONE = 0
        val REQUEST_URL = 1
        val RESPONSE_HEADERS = 1 shl 1
        val REQUEST_HEADERS = 1 shl 2
        val REQUEST_BODY = 1 shl 3
        val RESPONSE_BODY = 1 shl 4
        val RESPONSE_TYPE = 1 shl 5
        val REQUEST_TYPE = 1 shl 6
        val BEAN_MAPPING = 1 shl 7
        val GENERAL = 1 shl 8
    }
}