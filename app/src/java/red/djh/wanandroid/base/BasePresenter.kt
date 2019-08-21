package red.djh.wanandroid.base

import red.djh.wanandroid.mvp.IBasePresenter

/**
 * <pre>
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/08/15 13:45
 * desc   :
 * </pre>
 */
abstract class BasePresenter<V>(view: V) : IBasePresenter {

    private val mView:V = view

    fun getView(): V {
        return mView
    }
}