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
    fun e(tag: String, e: Exception)

    companion object {
        val REQUEST_BASE: Int = 1 shl 1
        val RESPONSE_BASE: Int = 1 shl 2
        val REQUEST_HEAD: Int = 1 shl 3
        val RESPONSE_HEAD: Int = 1 shl 4
        val ERROR: Int = 1 shl 5
        val ALL:Int = 1 shl 6
    }
}