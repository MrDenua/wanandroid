package red.djh.wanandroid.ui.login

import red.djh.wanandroid.base.BasePresenter
import red.djh.wanandroid.bean.user.UserBean
import red.djh.wanandroid.rx.SimpleObserver

/**
 * red.djh.wanandroid.presenter
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/13
 */
class LoginPresenterPresenter(view: LoginContract.View)
    : BasePresenter<LoginContract.View>(view),
    LoginContract.Presenter {

    private var mModel: LoginModelI =
        LoginModelI()

    override fun register() {
        getView().showMessage("register")
    }

    override fun forgetPassword() {
        getView().showMessage("forgetPassword")
    }

    override fun login() {

        getView().showMessage("login")
        mModel.login(getView().getUsername(), getView().getPassword())
            .subscribe(object :SimpleObserver<UserBean>(){
                override fun onSuccess(result: UserBean) {

                }
                override fun onFailure(msg: String) {
                    getView().showError(msg)
                }
            })
    }
}