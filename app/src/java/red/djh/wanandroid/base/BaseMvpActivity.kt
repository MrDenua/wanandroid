package red.djh.wanandroid.base

import android.os.Bundle
import android.widget.Toast
import red.djh.wanandroid.mvp.BasePresenter
import red.djh.wanandroid.mvp.BaseView

/**
 * red.djh.wanandroid.base
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/13
 */
abstract class BaseMvpActivity<P:BasePresenter>: BaseActivity(), BaseView<P> {

    lateinit var mPresenter: P

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())

        mPresenter = initPresenter()
    }
}