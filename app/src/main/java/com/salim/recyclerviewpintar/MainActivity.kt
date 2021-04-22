package com.salim.recyclerviewpintar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = ArrayList<ModelPortofolio>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set recyclerview layoutmanager
        rv_main?.layoutManager = LinearLayoutManager(this)
        list.addAll(DataPortofolio.listData)
        val adapter = AdapterPortofolio(list)
        rv_main?.adapter = adapter

        fab3.setOnClickListener {
            val go = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(go)
        }


    }
}