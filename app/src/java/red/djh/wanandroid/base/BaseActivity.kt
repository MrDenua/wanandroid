package red.djh.wanandroid.base

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * red.djh.wanandroid.base
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/12
 */
@SuppressLint("Registered")
abstract class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    protected fun startActivity(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }
}