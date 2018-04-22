package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.signuppage.*


class Signuppage : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    val mAuth = FirebaseAuth.getInstance()
    lateinit var mDatabase : DatabaseReference



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)


        val registerBtn = findViewById<View>(R.id.signup) as Button

        mDatabase = FirebaseDatabase.getInstance().getReference("Names")

        registerBtn.setOnClickListener(View.OnClickListener {
            registerUser()
        })

        textView9.setOnClickListener{
        val i = Intent(this, Loginpage::class.java)
        startActivity(i)
        }

    }

    private fun registerUser () {
        val emailTxt = findViewById<View>(R.id.editText4) as EditText
        val passwordTxt = findViewById<View>(R.id.pass1) as EditText
        val nameTxt = findViewById<View>(R.id.signUpName) as EditText

        var email = emailTxt.text.toString()
        var password = passwordTxt.text.toString()
        var name = nameTxt.text.toString()


        if (name.isEmpty())
        {
            nameTxt.setError("Please entre Username")
            nameTxt.requestFocus()
            return
        }


        if (email.isEmpty())
        {
            emailTxt.setError("Email is required")
            emailTxt.requestFocus()
            return
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            emailTxt.setError("Please enter a valid email")
            emailTxt.requestFocus()
            return
        }
        if (password.isEmpty())
        {
            passwordTxt.setError("Password is required")
            passwordTxt.requestFocus()
            return
        }
        if (password.length < 6)
        {
            passwordTxt.setError("Minimum lenght of password should be 6")
            passwordTxt.requestFocus()
            return
        }


        if (!email.isEmpty() && !password.isEmpty() && !name.isEmpty()) {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = mAuth.currentUser
                    val uid = user!!.uid
                    mDatabase.child(uid).child("Name").setValue(name)
                    startActivity(Intent(this, Mainpage::class.java))
                    Toast.makeText(this, "Successfully registered :-)", Toast.LENGTH_LONG).show()
                }else {
                    Toast.makeText(this, "Error registering, try again later :(", Toast.LENGTH_LONG).show()
                }
            })
        }else {
            Toast.makeText(this,"Please enter your details :|", Toast.LENGTH_LONG).show()
        }

    }
}