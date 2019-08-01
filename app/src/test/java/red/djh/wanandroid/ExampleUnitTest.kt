package red.djh.wanandroid

import io.reactivex.Observer
import io.reactivex.functions.Consumer
import org.junit.Test

import org.junit.Assert.*
import red.djh.wanandroid.api.SiteApi
import red.djh.wanandroid.network.RetrofitManager

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun text(){

        RetrofitManager.init(null, "https://www.wanandroid.com")
        SiteApi.API.getArticles(1)
            .subscribe {
                print(it)
            }
    }
}
