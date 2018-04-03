package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.homepage.*

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        /////login 1 btn
        logInbutton.setOnClickListener {
            val i = Intent(this,Loginpage::class.java)
            startActivity(i)
        }
        ////// create account btn
        createAccount.setOnClickListener {
            val i = Intent(this, Signuppage::class.java)
            startActivity(i)
        }
    }
}
