package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BukitSimarjarunjungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bukitsimarjarunjung)

        val buttonBack2 = findViewById<Button>(R.id.buttonBack2)

        buttonBack2.setOnClickListener {
            val intent = Intent(this, AlamActivity::class.java)
            startActivity(intent)
        }

        val buttonDashboard2 = findViewById<Button>(R.id.buttonDashboard2)

        buttonDashboard2.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}