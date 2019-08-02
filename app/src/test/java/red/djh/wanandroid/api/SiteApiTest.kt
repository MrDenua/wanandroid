package red.djh.wanandroid.api

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import red.djh.wanandroid.dto.LoginDto
import red.djh.wanandroid.dto.RegisterDto
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
    fun loginTest(){
        UserApi.Instance.API.login(mapOf("username" to "denua123", "password" to "denua1"))
            .subscribe({
                print(it)
            }, {
                print(it)
            })
    }

    @Test
    fun registerTest(){
        UserApi.Instance.API.register(RegisterDto("dengzi","d123456.","d123456."))
            .subscribe({
                print(it)
            }, {
                print(it)
            })
    }
}