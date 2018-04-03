package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.loginpage.*

class Loginpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)


        ////// after login, go to Main page (add treatments)!
        login2.setOnClickListener {
            val i = Intent(this,Mainpage::class.java)
            startActivity(i)
        }


    }
}
