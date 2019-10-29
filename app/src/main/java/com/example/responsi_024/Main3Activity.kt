package com.example.responsi_024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //register
        val email_anda=findViewById<EditText>(R.id.email_anda)
        val password_anda=findViewById<EditText>(R.id.password_anda)
        val nama_anda=findViewById<EditText>(R.id.nama_anda)
        val alamat_anda=findViewById<EditText>(R.id.alamat_anda)



        Priview.setOnClickListener(){

            val email_anda=email_anda.text.toString()
            val password_anda=password_anda.text.toString()
            val nama_anda=nama_anda.text.toString()
            val alamat_anda=alamat_anda.text.toString()


            intent= Intent(this,Main4Activity::class.java)
            intent.putExtra("email_anda",email_anda)
            intent.putExtra("password_anda",password_anda)
            intent.putExtra("nama_anda",nama_anda)
            intent.putExtra("alamat_anda",alamat_anda)

            startActivity(intent)
        }


    }
}
