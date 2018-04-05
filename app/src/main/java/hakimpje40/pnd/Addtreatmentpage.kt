package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.addtreatmentpage.*

class Addtreatmentpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addtreatmentpage)


        /// click / to add treatment, go to Listed treatments
        confirmTreatment.setOnClickListener{
            val i = Intent(this, ListTreatment::class.java)
            startActivity(i)
        }

        //// click X to cancel treatment addition
        cancelTreatment.setOnClickListener {
            val i = Intent(this, Mainpage::class.java)
            startActivity(i)
        }


    }
}

