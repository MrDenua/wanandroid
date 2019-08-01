package red.djh.wanandroid

import android.app.Application
import red.djh.wanandroid.network.RetrofitManager

/**
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/07/29 11:52
 * desc   :
 */
class App: Application(){

    override fun onCreate() {
        super.onCreate()

        RetrofitManager.init(this, "https://www.wanandroid.com")
    }
}
