package red.djh.wanandroid.base

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import red.djh.wanandroid.mvp.BaseView

/**
 * red.djh.wanandroid.base
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/12
 */
@SuppressLint("Registered")
abstract class BaseActivity : Activity(), BaseView {

    abstract fun getLayout(): Int

    abstract fun initView()

    abstract fun initData()

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }

    override fun onResume() {
        super.onResume()
        initView()
    }

    override fun onStart() {
        super.onStart()
        initData()
    }
}