package red.djh.wanandroid.view

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.EditText
import red.djh.wanandroid.R
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
    : BaseMvpActivity<LoginContract.ILoginPresenter>(),
    LoginContract.ILoginView {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }

    override fun initPresenter(): LoginContract.ILoginPresenter {
        return LoginPresenter(this)
    }

    lateinit var mEtUsername: EditText
    lateinit var mEtPassword: EditText

    override fun getLayout() = R.layout.activity_login

    override fun initView() {
        mEtUsername = findViewById(R.id.et_username)
        mEtPassword = findViewById(R.id.et_password)
        findViewById<View>(R.id.bt_submit).setOnClickListener {
            mPresenter.login()
        }
        findViewById<View>(R.id.bt_register).setOnClickListener {
            mPresenter.register()
        }
        findViewById<View>(R.id.bt_forget_password).setOnClickListener {
            mPresenter.forgetPassword()
        }
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