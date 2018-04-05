package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.addtreatmentpage.*
import kotlinx.android.synthetic.main.mainpage.*

class Mainpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)


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
}
