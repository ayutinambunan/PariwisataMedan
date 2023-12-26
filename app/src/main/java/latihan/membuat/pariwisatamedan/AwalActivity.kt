package latihan.membuat.pariwisatamedan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AwalActivity : AppCompatActivity(), View.OnClickListener {
    // deklarasi variable
    private lateinit var btn_switch: Button
    private lateinit var btn_move : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)
        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener(this)
        btn_move = findViewById(R.id.btn_move)
        btn_move.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_switch -> {
                val move = Intent(this@AwalActivity, LoginActivity::class.java)
                startActivity(move)
            }
            R.id.btn_move -> {
                val intentData = Intent(this@AwalActivity, RegisterActivity::class.java)
                startActivity(intentData)
            }
        }
    }
}
