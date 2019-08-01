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
    var datas: List<T>,
    var pageCount: Int,
    var total: Int
)