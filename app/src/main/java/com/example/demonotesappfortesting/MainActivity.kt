package com.example.demonotesappfortesting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var title: EditText
    lateinit var description: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSubmit = findViewById<Button>(R.id.btn_submit)
        title = findViewById<EditText>(R.id.edt_title)
        description = findViewById<EditText>(R.id.edt_description)

        btnSubmit.setOnClickListener {

            val t = title.text.toString()
            val d = description.text.toString()
            val intent = Intent(this, NotesDetailsActivity::class.java).apply{
                putExtra("title",t)
                putExtra("description",d)
            }

            startActivity(intent)
        }

    }
}