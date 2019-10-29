package com.example.responsi_024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val id:Int = 10
    val language:String="kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val email=findViewById<EditText>(R.id.email)
        val pass=findViewById<EditText>(R.id.pass)


        button_login.setOnClickListener(){
            val Email=email.text.toString()
            val Pass=pass.text.toString()


            //oper dari main acrivity 3
            val email_anda=intent.getStringExtra("email_anda")
            val password_anda=intent.getStringExtra("password_anda")
            val nama_anda=intent.getStringExtra("nama_anda")
            val alamat_anda=intent.getStringExtra("alamat_anda")



            if (Email.isEmpty() ||Pass.isEmpty()){
                Toast.makeText(this,"Tolong Masukan Email Dan Passwor Anda ",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            if ((Email!=email_anda)) {

                Toast.makeText(this, "Email Anda Salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if (Pass!=password_anda) {
                Toast.makeText(this, "Password Anda Salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                /*         }
                         if (Email=="furqonfauzi28@gmail.com"||Pass=="terbang123")
             */
                intent= Intent(this,Main2Activity::class.java)
                intent.putExtra("email_anda",email_anda)
                intent.putExtra("password_anda",password_anda)
                intent.putExtra("nama_anda",nama_anda)
                intent.putExtra("alamat_anda",alamat_anda)


                intent.putExtra("Email",Email)
                intent.putExtra("Pass",Pass)
                startActivity(intent)





        }
// lonvcat ke activity  Register
        button_register.setOnClickListener(){
            intent= Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
    }
}
