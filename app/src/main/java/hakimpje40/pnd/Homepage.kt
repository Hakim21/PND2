package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.homepage.*


class Homepage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        /////login 1 button takes you to login page
        logInbutton.setOnClickListener {
            val i = Intent(this,Loginpage::class.java)
            startActivity(i)
        }
        ////// create account button takes you to singup page
        createAccount.setOnClickListener {
            val i = Intent(this, Signuppage::class.java)
            startActivity(i)
        }



    }
}


