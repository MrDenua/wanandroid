package red.djh.wanandroid.contract

import red.djh.wanandroid.mvp.BasePresenter
import red.djh.wanandroid.mvp.BaseView

/**
 * red.djh.wanandroid.contract
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/11
 */
interface LoginContract {

    interface LoginView:BaseView<LoginPresenter>{
        fun getUsername(): String
        fun getPassword(): String
        fun clearInput()
    }

    interface LoginPresenter :BasePresenter{
        fun login()
        fun forgetPassword()
        fun register()
    }
}