package com.salim.recyclerviewpintar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //mengambil data dikirim
        var judul = intent.getStringExtra("NAMA")
        var detail = intent.getStringExtra("DETAIL")
        var image = intent.getIntExtra("IMAGE",1)

        //set datanya
        tv_nama_porto_detail.text = judul
        tv_detail_porto_detail.text = detail
        img_portofolio_detail.setImageResource(image)
        //atau bisa juga pake yang di bawah
//        Glide.with(this).load(image).into(img_portofolio_detail)
    }
}