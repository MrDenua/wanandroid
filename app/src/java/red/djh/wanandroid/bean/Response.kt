package red.djh.wanandroid.bean

/**
 * red.djh.wanandroid.bean
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
data class Response<T>(
    var data: T,
    var errorCode: Int,
    var errorMsg: String
)