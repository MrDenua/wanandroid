package red.djh.wanandroid.model

import io.reactivex.Observable
import red.djh.wanandroid.api.UserApi
import red.djh.wanandroid.bean.user.UserBean
import red.djh.wanandroid.contract.LoginContract
import red.djh.wanandroid.rx.ResponseHandleFun

/**
 * red.djh.wanandroid.model
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/21
 */

class LoginModelI : LoginContract.Model {

    override fun forgetPassword(username: String): Observable<UserBean> {
        return Observable.empty()
    }


    override fun login(username: String, password: String): Observable<UserBean> {

        return UserApi.Instance.API
            .login(username, password)
            .flatMap(ResponseHandleFun())
    }
}