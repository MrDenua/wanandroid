package red.djh.wanandroid.view

import android.view.View
import android.widget.EditText
import red.djh.wanandroid.R
import red.djh.wanandroid.base.BaseActivity
import red.djh.wanandroid.base.BaseMvpActivity
import red.djh.wanandroid.contract.LoginContract
import red.djh.wanandroid.presenter.LoginPresenter

/**
 * red.djh.wanandroid.view
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/12
 */
class LoginActivity
    : BaseMvpActivity<LoginContract.LoginPresenter>(),
    LoginContract.LoginView {

    override fun initPresenter(): LoginContract.LoginPresenter {
        return LoginPresenter()
    }

    lateinit var mEtUsername: EditText
    lateinit var mEtPassword: EditText


    override fun getLayout(): Int {
        return R.layout.activity_login
    }

    override fun initView() {
        mEtUsername = findViewById(R.id.et_username)
        mEtPassword = findViewById(R.id.et_password)
        findViewById<View>(R.id.bt_submit).setOnClickListener {  }
    }

    override fun initData() {

    }

    override fun getUsername(): String {
        return mEtUsername.text.toString()
    }

    override fun getPassword(): String {
        return mEtPassword.text.toString()
    }

    override fun clearInput() {
        mEtPassword.setText("")
        mEtUsername.setText("")
    }
}