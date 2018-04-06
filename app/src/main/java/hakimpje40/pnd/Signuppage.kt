package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.signuppage.*

class Signuppage : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)



            // after sign up go to login page !
            signup.setOnClickListener{
                val i = Intent(this,Loginpage::class.java)
                startActivity(i)
            }


        }
    }