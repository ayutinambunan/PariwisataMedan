package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KawahPutihActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawahputih)

        val buttonBack3 = findViewById<Button>(R.id.buttonBack3)

        buttonBack3.setOnClickListener {
            val intent = Intent(this, AlamActivity::class.java)
            startActivity(intent)
        }

        val buttonDashboard3 = findViewById<Button>(R.id.buttonDashboard3)

        buttonDashboard3.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}