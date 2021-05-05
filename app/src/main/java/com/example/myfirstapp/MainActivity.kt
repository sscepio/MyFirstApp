package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var buttonSearch: Button
    private lateinit var textInput: EditText
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSearch = findViewById(R.id.search_button)
        textInput = findViewById(R.id.textInput)
        textView = findViewById(R.id.info)

        buttonSearch.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val name:String = textInput.text.toString().trim()
                textView.text = "Вы выбрали фильм   $name"
            }

        })
    }
}