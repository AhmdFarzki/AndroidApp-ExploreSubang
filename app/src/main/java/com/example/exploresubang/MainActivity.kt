package com.example.exploresubang

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListWisataAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Wisata) {
                showSelectedWisata(data)
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.about, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(moveIntent)
            true
        }
        R.id.action_exit -> {
            System.exit(0);
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
    fun msgShow(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    private fun showSelectedWisata(wisata: Wisata) {
        when (rvWisata.id) {
            R.id.rv_wisata -> {
                val moveIntent = Intent(this@MainActivity, DetailAter::class.java)
                moveIntent.putExtra(DetailAter.EXTRA_NAME, wisata.name)
                moveIntent.putExtra(DetailAter.EXTRA_DETAIL, wisata.detail)
                moveIntent.putExtra(DetailAter.EXTRA_FOTO, wisata.photo)
                moveIntent.putExtra(DetailAter.EXTRA_ADALAH, wisata.adalah)
                moveIntent.putExtra(DetailAter.EXTRA_FOTO2, wisata.photo2)
                startActivity(moveIntent)
            }
        }

    }

}

