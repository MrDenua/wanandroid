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
    val data: T,
    val errorCode: Int,
    val errorMsg: String
)