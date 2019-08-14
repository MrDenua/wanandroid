package red.djh.wanandroid.mvp

/**
 * red.djh.wanandroid.mvp
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/12
 */
interface BaseView<P : BasePresenter> {
    fun initPresenter():P
    fun showLoading()
    fun hideLoading()
    fun showMessage(msg: String)
    fun showError(msg: String)
}