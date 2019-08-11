package red.djh.wanandroid.contract

/**
 * red.djh.wanandroid.contract
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/11
 */
interface LoginContract {

    interface LoginView {
        fun getUsername(): String
        fun getPassword(): String
        fun clearInput()
    }

    interface LoginPresenter {
        fun login()
    }
}