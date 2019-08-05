package red.djh.wanandroid.network

/**
 * red.djh.wanandroid.network
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/5
 */
interface NetworkLogger {
    var level: Int
    fun i(type: Int, tag: String, log: String)
    fun e(type: Int, tag: String, log: Throwable)
    fun isLogType(type: Int): Boolean
}