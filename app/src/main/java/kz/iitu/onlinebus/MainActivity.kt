package kz.iitu.onlinebus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<View>(R.id.search) as Button

        btn.setOnClickListener() {
            intent = Intent(this, Services::class.java)
            startActivity(intent)
        }
    }


}