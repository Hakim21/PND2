package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.mainpage.*

class Mainpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

        addTreatmentbutton.setOnClickListener {
            val i = Intent(this,Addtreatmentpage::class.java)
            startActivity(i)

        }
    }
}
