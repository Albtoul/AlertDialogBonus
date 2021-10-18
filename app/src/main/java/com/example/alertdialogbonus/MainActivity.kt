package com.example.alertdialogbonus

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var bt:Button
    lateinit var show:Button
   lateinit var move:Button
    lateinit var ed:EditText
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog =Dialog(this)
        dialog.setContentView(R.layout.dilog)

       bt=findViewById(R.id.button)
        ed=dialog.findViewById(R.id.edtext)
        tv=dialog.findViewById(R.id.textView)
        show=dialog.findViewById(R.id.button2)
        move=dialog.findViewById(R.id.button3)

        bt.setOnClickListener {

            show.setOnClickListener {
              tv.text="${ed.text}"
            }

            move.setOnClickListener {

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name" , ed.text.toString())
                startActivity(intent)

            }
            dialog.show()
        }



    }



}