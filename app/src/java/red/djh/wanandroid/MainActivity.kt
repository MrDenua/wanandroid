package red.djh.wanandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import red.djh.wanandroid.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    lateinit var fragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoginActivity.start(this)

    }
}
