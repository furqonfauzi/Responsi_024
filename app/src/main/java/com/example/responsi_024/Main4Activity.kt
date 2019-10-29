package com.example.responsi_024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var intent = intent
        val email_anda=intent.getStringExtra("email_anda")
        val password_anda=intent.getStringExtra("password_anda")
        val nama_anda=intent.getStringExtra("nama_anda")
        val alamat_anda=intent.getStringExtra("alamat_anda")

        val hasil=findViewById<TextView>(R.id.hasil)
        intent= Intent()
        hasil.text="Nama Anda       : "+nama_anda+"\nAlamat Anda     : "+alamat_anda+"\nEmail Anda       : "+email_anda+"\nPassword Anda  : "+password_anda

       button3.setOnClickListener(){
         intent= Intent(this,Main3Activity::class.java)
           startActivity(intent)
       }

        button2.setOnClickListener(){
            intent= Intent(this,MainActivity::class.java)
            intent.putExtra("email_anda",email_anda)
            intent.putExtra("password_anda",password_anda)
            intent.putExtra("nama_anda",nama_anda)
            intent.putExtra("alamat_anda",alamat_anda)
            startActivity(intent)
        }
    }

}
