package com.badlogic.androidgames.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.badlogic.androidgames.affirmations.data.Datasource
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText:TextView = findViewById(R.id.tvText)
        myText.text = Datasource().loadAffirmations().size.toString()
    }
}