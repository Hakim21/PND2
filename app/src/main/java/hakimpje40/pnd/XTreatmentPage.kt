package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.xtreatmentpage.*

class XTreatmentPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xtreatmentpage)

        confirmTreatment2.setOnClickListener {
            val i = Intent(this, ListTreatment::class.java)
            startActivity(i)
        }

        cancelTreatment2.setOnClickListener {
            val i = Intent(this, ListTreatment::class.java)
            startActivity(i)
        }
    }
}
