package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TamanBuayaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamanbuaya)

        val buttonBack9 = findViewById<Button>(R.id.buttonBack9)

        buttonBack9.setOnClickListener {
            val intent = Intent(this, AlamActivity::class.java)
            startActivity(intent)
        }

        val buttonDashboard9 = findViewById<Button>(R.id.buttonDashboard9)

        buttonDashboard9.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}