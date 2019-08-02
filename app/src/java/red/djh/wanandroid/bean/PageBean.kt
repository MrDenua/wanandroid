package red.djh.wanandroid.bean

/**
 * red.djh.wanandroid.bean
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/1
 */
data class PageBean<T>(
    val datas: List<T>,
    val pageCount: Int,
    val total: Int,
    val curPage: Int,
    val size: Int,
    val over: Boolean,
    val offset: Int
)