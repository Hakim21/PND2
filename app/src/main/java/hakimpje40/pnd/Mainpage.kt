package hakimpje40.pnd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.mainpage.*

class Mainpage : AppCompatActivity() {


    lateinit var mDatabase : DatabaseReference
    var mAuth = FirebaseAuth.getInstance()
    var user = FirebaseAuth.getInstance().currentUser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)


        val nameTxt = findViewById<View>(R.id.welcomeUser) as TextView
        var uid = user!!.uid

        mDatabase = FirebaseDatabase.getInstance().getReference("Names")
        mDatabase.child(uid).child("Name").addValueEventListener( object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }



            override fun onDataChange(snapshot: DataSnapshot) {
                nameTxt.text =  "Welcome " + snapshot.value.toString()
            }
        })

        // click add treatment to go to add treatment page !
        addTreatmentbutton.setOnClickListener {
            val i = Intent(this, Addtreatmentpage::class.java)
            startActivity(i)
        }

        //// these two button take you to listed treatment page where you can see, edit and delete existing treatments
        listTreatmentbutton.setOnClickListener{
            val i = Intent(this, ListTreatment::class.java)
            startActivity(i)

        }
        editTreatmentbutton.setOnClickListener {
            val i = Intent(this, ListTreatment::class.java)
            startActivity(i)
        }
    }


    ///// Stopped here [Sign out btn !!!!] at WORD?

}
