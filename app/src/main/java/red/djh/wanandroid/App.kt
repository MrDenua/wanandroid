package red.djh.wanandroid

/**
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/07/29 11:52
 * desc   :
 */
class App {
    var String.S: String
        get() = "s"
        set(value) {}

    fun String.t(): String {
        return this.plus("21")
    }
}