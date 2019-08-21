package red.djh.wanandroid.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * red.djh.wanandroid.rx
 *
 *
 * @author dengzi
 * @email denua@foxmail.com
 * @date 2019/8/21
 */
abstract class SimpleObserver<T> : Observer<T> {

    override fun onComplete() {

    }

    override fun onSubscribe(d: Disposable) {

    }

    final override fun onNext(t: T) {
        try {
            onSuccess(t)
        } catch (e: NullPointerException) {
            onError(e)
        }
    }

    final override fun onError(e: Throwable) {
        e.message?.let { onFailure(it) }
        e.printStackTrace()
    }

    abstract fun onSuccess(result: T)

    abstract fun onFailure(msg: String)
}