package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.annotation.NonNull
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth


class resetPassword : AppCompatActivity() {


    private lateinit var passwordEmail: EditText
    private lateinit var resetPassword: Button
    private lateinit var firebaseAuth: FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resetpassword)

        passwordEmail = findViewById(R.id.etPasswordEmail) as EditText
        resetPassword = findViewById(R.id.btnPasswordRest) as Button
        firebaseAuth = FirebaseAuth.getInstance()


        resetPassword.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view:View) {
                val useremail = passwordEmail.getText().toString().trim()
                if (useremail == "")
                {
                    Toast.makeText(this@resetPassword, "Please enter you registered Email", Toast.LENGTH_SHORT).show()
                }else{
                    firebaseAuth.sendPasswordResetEmail(useremail).addOnCompleteListener(object: OnCompleteListener<Void> {
                        override fun onComplete(@NonNull task: Task<Void>) {
                            if (task.isSuccessful())
                            {
                                Toast.makeText(this@resetPassword, "Password reset email sent!", Toast.LENGTH_SHORT).show()
                                finish()
                                startActivity(Intent(this@resetPassword, Loginpage::class.java))
                            }
                            else
                            {
                                Toast.makeText(this@resetPassword, "Error in sending password reset email", Toast.LENGTH_SHORT).show()
                            }
                        }
                    })
                }
            }
        })
    }
}