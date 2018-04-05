package hakimpje40.pnd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.listtreatment.*

class ListTreatment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listtreatment)

        textView10.setOnClickListener{
            val i = Intent(this, XTreatmentPage::class.java)
            startActivity(i)
        }

        textView7.setOnClickListener{
            val  i = Intent(this, XTreatmentPage::class.java)
            startActivity(i)
        }

        textView11.setOnClickListener{
            val  i = Intent(this, XTreatmentPage::class.java)
            startActivity(i)
        }

    }
}
