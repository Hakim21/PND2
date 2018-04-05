package hakimpje40.pnd

import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.ContactsContract
import android.text.LoginFilter
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import kotlinx.android.synthetic.main.homepage.*
import kotlinx.android.synthetic.main.signuppage.*
import java.net.PasswordAuthentication

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