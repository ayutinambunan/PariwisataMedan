package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GpibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpib)

        val buttonBack14 = findViewById<Button>(R.id.buttonBack14)

        buttonBack14.setOnClickListener {
            val intent = Intent(this, AlamActivity::class.java)
            startActivity(intent)
        }

        val buttonDashboard14 = findViewById<Button>(R.id.buttonDashboard14)

        buttonDashboard14.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}