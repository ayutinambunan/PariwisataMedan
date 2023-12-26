package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KulinerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuliner)

        val btn_ucok = findViewById<Button>(R.id.btn_ucok)

        btn_ucok.setOnClickListener {
            val intent = Intent(this, UcokDurianActivity::class.java)
            startActivity(intent)
        }

        val btn_ambon = findViewById<Button>(R.id.btn_ambon)

        btn_ambon.setOnClickListener {
            val intent = Intent(this, BikaAmbonActivity::class.java)
            startActivity(intent)
        }

        val btn_mieaceh = findViewById<Button>(R.id.btn_mieaceh)

        btn_mieaceh.setOnClickListener {
            val intent = Intent(this, MieAcehTitiActivity::class.java)
            startActivity(intent)
        }

        val btn_kesawan = findViewById<Button>(R.id.btn_kesawan)

        btn_kesawan.setOnClickListener {
            val intent = Intent(this, KesawanActivity::class.java)
            startActivity(intent)
        }

        val btn_rujak = findViewById<Button>(R.id.btn_rujak)

        btn_rujak.setOnClickListener {
            val intent = Intent(this, RujakKolamActivity::class.java)
            startActivity(intent)
        }

        val btn_back3 = findViewById<Button>(R.id.btn_back3)

        btn_back3.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}