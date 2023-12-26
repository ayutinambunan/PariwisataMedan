package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EdukasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi)

        val buttonPerkebunan = findViewById<Button>(R.id.buttonPerkebunan)

        buttonPerkebunan.setOnClickListener {
            val intent = Intent(this, PerkebunanActivity::class.java)
            startActivity(intent)
        }

        val buttonAvros = findViewById<Button>(R.id.buttonAvros)

        buttonAvros.setOnClickListener {
            val intent = Intent(this, TamanEdukasiActivity::class.java)
            startActivity(intent)
        }

        val buttonRahmat = findViewById<Button>(R.id.buttonRahmat)

        buttonRahmat.setOnClickListener {
            val intent = Intent(this, RahmatInternationalActivity::class.java)
            startActivity(intent)
        }

        val buttonBatak = findViewById<Button>(R.id.buttonBatak)

        buttonBatak.setOnClickListener {
            val intent = Intent(this, MuseumBatakActivity::class.java)
            startActivity(intent)
        }

        val buttonBuaya = findViewById<Button>(R.id.buttonBuaya)

        buttonBuaya.setOnClickListener {
            val intent = Intent(this, TamanBuayaActivity::class.java)
            startActivity(intent)
        }

        val btn_back1 = findViewById<Button>(R.id.btn_back1)

        btn_back1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}