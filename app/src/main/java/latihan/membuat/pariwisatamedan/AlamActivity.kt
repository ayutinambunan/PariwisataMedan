package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alam)

        val btn_terjun = findViewById<Button>(R.id.btn_terjun)

        btn_terjun.setOnClickListener {
            val intent = Intent(this, TerjunDuaWarnaActivity::class.java)
            startActivity(intent)
        }

        val btn_bukit = findViewById<Button>(R.id.btn_bukit)

        btn_bukit.setOnClickListener {
            val intent = Intent(this, BukitSimarjarunjungActivity::class.java)
            startActivity(intent)
        }

        val btn_kawah = findViewById<Button>(R.id.btn_kawah)

        btn_kawah.setOnClickListener {
            val intent = Intent(this, KawahPutihActivity::class.java)
            startActivity(intent)
        }

        val btn_soda = findViewById<Button>(R.id.btn_soda)

        btn_soda.setOnClickListener {
            val intent = Intent(this, PemandianSodaActivity::class.java)
            startActivity(intent)
        }

        val btn_kalimantung = findViewById<Button>(R.id.btn_kalimantung)

        btn_kalimantung.setOnClickListener {
            val intent = Intent(this, KalimantungActivity::class.java)
            startActivity(intent)
        }

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}