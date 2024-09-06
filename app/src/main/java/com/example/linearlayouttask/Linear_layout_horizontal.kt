package com.example.linearlayouttask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Linear_layout_horizontal : AppCompatActivity() {
    var c:EditText?=null
    var d:Button?=null
    var e:EditText?=null
    var f:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linear_layout_horizontal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
c=findViewById(R.id.edt2)
d=findViewById(R.id.btn2)
d?.setOnClickListener {
    if(c?.text.toString().isNullOrBlank()){
        c?.error="value required"
        Toast.makeText(this,"Enter a value",Toast.LENGTH_SHORT
        ).show()
    }
    else{
        var intent = Intent(this,Textview::class.java)
        startActivity(intent)
    }

}

        e=findViewById(R.id.edt3)
        f=findViewById(R.id.btn3)
        f?.setOnClickListener{
            if(e?.text.toString().isNullOrBlank()){
                e?.error="value required"
                Toast.makeText(this,"Enter a value",Toast.LENGTH_SHORT
                ).show()
            }
            else{
                var intent = Intent(this,Lastscreen::class.java)
                startActivity(intent)
            }
        }

    }
}