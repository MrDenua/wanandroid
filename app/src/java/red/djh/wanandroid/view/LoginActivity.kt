package red.djh.wanandroid.view

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import red.djh.wanandroid.R
import red.djh.wanandroid.base.BaseActivity
import red.djh.wanandroid.contract.LoginContract

/**
 * red.djh.wanandroid.view
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/12
 */
class LoginActivity: BaseActivity(), LoginContract.LoginView {

    lateinit var mEtUsername:EditText
    lateinit var mEtPassword:EditText

    override fun getLayout(): Int {
        return R.layout.activity_login
    }

    override fun initView() {

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