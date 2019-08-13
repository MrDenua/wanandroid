package red.djh.wanandroid.contract

import red.djh.wanandroid.mvp.BasePresenter

/**
 * red.djh.wanandroid.contract
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/11
 */
interface LoginContract {

    interface LoginView<T:BasePresenter> {
        fun getUsername(): String
        fun getPassword(): String
        fun clearInput()
    }

    interface LoginPresenter :BasePresenter{
        fun login()
    }
}