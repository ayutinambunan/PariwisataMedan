package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReligiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_religi)

        val btn_hkbp = findViewById<Button>(R.id.btn_hkbp)

        btn_hkbp.setOnClickListener {
            val intent = Intent(this, HkbpSudirmanActivity::class.java)
            startActivity(intent)
        }

        val btn_graha = findViewById<Button>(R.id.btn_graha)

        btn_graha.setOnClickListener {
            val intent = Intent(this, GrahaMariaActivity::class.java)
            startActivity(intent)
        }

        val btn_masjid = findViewById<Button>(R.id.btn_masjid)

        btn_masjid.setOnClickListener {
            val intent = Intent(this, MasjidRayaActivity::class.java)
            startActivity(intent)
        }

        val btn_vihara = findViewById<Button>(R.id.btn_vihara)

        btn_vihara.setOnClickListener {
            val intent = Intent(this, ViharaSiuActivity::class.java)
            startActivity(intent)
        }

        val btn_gpib = findViewById<Button>(R.id.btn_gpib)

        btn_gpib.setOnClickListener {
            val intent = Intent(this, GpibActivity::class.java)
            startActivity(intent)
        }

        val tn_masjidosmani = findViewById<Button>(R.id.tn_masjidosmani)

        tn_masjidosmani.setOnClickListener {
            val intent = Intent(this, MasjidOsmaniActivity::class.java)
            startActivity(intent)
        }

        val btn_back2 = findViewById<Button>(R.id.btn_back2)

        btn_back2.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}