package red.djh.wanandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import red.djh.wanandroid.view.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoginActivity.start(this)
    }
}
