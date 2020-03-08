package com.example.exploresubang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailAter : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_FOTO = "extra_foto"
        const val EXTRA_ADALAH = "extra_adalah"
        const val EXTRA_FOTO2 = "extra_foto2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_ater)

        val tvName: TextView = findViewById(R.id.ater)
        val imgPhoto: ImageView = findViewById(R.id.foto)
        val tvDetail: TextView  = findViewById(R.id.detail)
        val tvAdalah: TextView = findViewById(R.id.adalah)
        val imgPhoto2: ImageView = findViewById(R.id.foto2)

        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tImg = intent.getIntExtra(EXTRA_FOTO, 0)
        val tName = intent.getStringExtra(EXTRA_NAME)
        val tAdalah = intent.getStringExtra(EXTRA_ADALAH)
        val tFoto2 = intent.getIntExtra(EXTRA_FOTO2, 0)

        tvName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvDetail.text = tDetail
        tvAdalah.text = tAdalah
        Glide.with(this)
            .load(tFoto2)
            .apply(RequestOptions())
            .into(imgPhoto2)
    }
}
