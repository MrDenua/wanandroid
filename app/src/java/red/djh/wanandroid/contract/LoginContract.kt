package red.djh.wanandroid.contract

import io.reactivex.Observable
import red.djh.wanandroid.bean.user.UserBean
import red.djh.wanandroid.mvp.IBaseModel
import red.djh.wanandroid.mvp.IBasePresenter
import red.djh.wanandroid.mvp.IBaseView

/**
 * red.djh.wanandroid.contract
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/11
 */
interface LoginContract {

    interface View : IBaseView {
        fun getUsername(): String
        fun getPassword(): String
        fun clearInput()
        fun gotoMain()
    }

    interface Presenter : IBasePresenter {
        fun login()
        fun forgetPassword()
        fun register()
    }

    interface Model : IBaseModel {
        fun login(username: String, password: String): Observable<UserBean>
        fun forgetPassword(username: String): Observable<UserBean>
    }
}