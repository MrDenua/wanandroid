package red.djh.wanandroid.rx

import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import red.djh.wanandroid.bean.Response

/**
 * red.djh.wanandroid.rx
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/21
 */

class ResponseHandleFun<T> : Function<Response<T>, ObservableSource<T>> {

    override fun apply(response: Response<T>): ObservableSource<T> {
        if (response.errorCode == 0) {
            return Observable.just(response.data)
        }
        throw NullPointerException("${response.errorCode}, ${response.errorMsg}")
    }

}