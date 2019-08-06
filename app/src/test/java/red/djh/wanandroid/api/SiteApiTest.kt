package red.djh.wanandroid.api

import org.junit.Before
import org.junit.Test
import red.djh.wanandroid.network.RetrofitManager

/**
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/08/02 16:36
 * desc   :
 */
class SiteApiTest {


    @Before
    fun setUp() {
        RetrofitManager.init(null, "https://www.wanandroid.com")
    }

    @Test
    fun loginTest() {
        UserApi.Instance.API.login("dengzi2", "d123456.")
            .subscribe({

                print(it)
            }, {
                it.printStackTrace()
            })
    }

    @Test
    fun registerTest() {
        UserApi.Instance.API.register("dengzi2", "d123456.", "d123456.")
            .subscribe({
                print(it)
            }, {
                it.printStackTrace()
            })
    }
}