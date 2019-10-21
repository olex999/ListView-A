package com.example.listview_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variabel1
        val language = listOf("Kotlin","Python","Ruby","JavaScript","PHP")

        List_view.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, language)

        List_view.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this,"Anda memilih: ${language[position]}",
                Toast.LENGTH_SHORT).show()
        }
    }
}
