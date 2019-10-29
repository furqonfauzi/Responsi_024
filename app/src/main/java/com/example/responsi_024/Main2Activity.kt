package com.example.responsi_024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent=intent
        val Email=intent.getStringExtra("Email")
        val Pass=intent.getStringExtra("Pass")
        val email_anda=intent.getStringExtra("email_anda")
        val password_anda=intent.getStringExtra("password_anda")
        val nama_anda=intent.getStringExtra("nama_anda")
        val alamat_anda=intent.getStringExtra("alamat_anda")

        //val nama:String
        val keluaran=findViewById<TextView>(R.id.hasil)
        keluaran.text="Nama Anda       : "+nama_anda+"\nAlamat Anda     : "+alamat_anda+"\nEmail Anda       : "+email_anda+"\nPassword Anda  : "+password_anda

        button_back.setOnClickListener(){
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }




    }
}
