package red.djh.wanandroid.presenter

import red.djh.wanandroid.base.BasePresenter
import red.djh.wanandroid.contract.LoginContract

/**
 * red.djh.wanandroid.presenter
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/13
 */
class LoginPresenter(view: LoginContract.ILoginView)
    : BasePresenter<LoginContract.ILoginView>(view),
    LoginContract.ILoginPresenter {

    override fun register() {
        getView().showMessage("register")
    }

    override fun forgetPassword() {
        getView().showMessage("forgetPassword")
    }

    override fun login() {

        getView().showMessage("login")
    }
}