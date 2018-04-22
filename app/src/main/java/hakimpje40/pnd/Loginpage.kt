package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.loginpage.*


class Loginpage : AppCompatActivity() {

    val mAuth = FirebaseAuth.getInstance()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)


        val loginBtn = findViewById<View>(R.id.login2) as Button

        val toSignUp = findViewById<View>(R.id.textView12) as TextView

        loginBtn.setOnClickListener(View.OnClickListener {
            view -> login()
        })
        toSignUp.setOnClickListener(View.OnClickListener {
            view -> toSignUpPage()
        })

        forgetPassword.setOnClickListener {
            val i = Intent(this, resetPassword::class.java)
            startActivity(i)
        }

    }

    private fun login(){
        val emailTxt = findViewById<View>(R.id.editText) as EditText
        var email = emailTxt.text.toString()

        val passwordTxt = findViewById<View>(R.id.editText2) as EditText
        var password = passwordTxt.text.toString()

        if (emailTxt.text.isEmpty())
        {
            emailTxt.setError("Please enter your email")
            emailTxt.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            emailTxt.setError("Please enter a valid email")
            emailTxt.requestFocus()
            return
        }

        if (passwordTxt.text.isEmpty())
        {
            passwordTxt.setError("Please enter your password")
            passwordTxt.requestFocus()
            return
        }


        if (!email.isEmpty() && !password.isEmpty()) {
            this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener ( this, OnCompleteListener<AuthResult> { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, Mainpage::class.java))
                    Toast.makeText(this, "Successfully Logged in :)", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Error Logging in :(", Toast.LENGTH_SHORT).show()
                }
            })

        }else {
            Toast.makeText(this, "Please fill up the Credentials :|", Toast.LENGTH_SHORT).show()
        }
    }

    private fun toSignUpPage () {
        startActivity(Intent(this, Signuppage::class.java))
    }


}


