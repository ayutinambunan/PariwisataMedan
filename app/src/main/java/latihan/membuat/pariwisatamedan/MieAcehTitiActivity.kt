package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MieAcehTitiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mieacehtiti)

        val buttonBack18 = findViewById<Button>(R.id.buttonBack18)

        buttonBack18.setOnClickListener {
            val intent = Intent(this, AlamActivity::class.java)
            startActivity(intent)
        }

        val buttonDashboard18 = findViewById<Button>(R.id.buttonDashboard18)

        buttonDashboard18.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}