package com.badlogic.androidgames.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.badlogic.androidgames.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val myRecycler = findViewById<RecyclerView>(R.id.rvAffirmation)
        myRecycler.adapter = ItemAdapter(this, myDataset)
        myRecycler.setHasFixedSize(true)
    }
}