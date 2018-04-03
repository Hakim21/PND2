package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.signuppage.*

class Signuppage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)

        ///// after sign up go to Login page!

        signup.setOnClickListener {
            val i = Intent(this, Loginpage::class.java)
            startActivity(i)

        }

        //// sign up via social media !!!

        ///google.setOnClickListener {
        ///val i = Intent(this, google login page)
        ///startActivity(i)
        //}

        //facebook.setOnClickListener {
        ///val i = Intent(this,facebook login page)
        ////startActivity(i)
        //}

        ///twitter.setOnClickListener {
        ///val i = Intent(this. twitter login page)
        ///startActivity(i)
        //}


    }
}