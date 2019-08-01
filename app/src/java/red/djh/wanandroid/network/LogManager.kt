package red.djh.wanandroid.network

import java.lang.Exception

/**
 * red.djh.wanandroid.network
 *
 *
 * @author denua
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
class LogManager(logger: Logger, logLevel: Int) : Logger {

    private val mLogger: Logger = logger
    private var mLogLevel: Int = logLevel

    fun info(type: Int, tag: String, log: String) {
        if (mLogLevel and type != 0){
            i(tag, log)
        }
    }

    fun error(type: Int, tag: String, log: String) {
        if (mLogLevel and type != 0){
            i(tag, log)
        }
    }

    override fun i(tag: String, log: String) {
        mLogger.i(tag, log)
    }

    override fun e(tag: String, e: Exception) {
        mLogger.e(tag, e)
    }
}