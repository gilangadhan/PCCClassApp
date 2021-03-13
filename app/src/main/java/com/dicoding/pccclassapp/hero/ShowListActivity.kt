package com.dicoding.pccclassapp.hero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.pccclassapp.R

class ShowListActivity : AppCompatActivity() {
    private lateinit var listHero: RecyclerView
    private val list = ArrayList<HeroModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_list)

        listHero = findViewById(R.id.listHero)
        listHero.setHasFixedSize(true)

        list.addAll(getListHeroes())

        val adapter = HeroAdapter(listHero = list)
        listHero.adapter = adapter
        listHero.layoutManager = LinearLayoutManager(this)
    }

    // Load data String
    private fun getListHeroes(): ArrayList<HeroModel> {
        val dataDesc = resources.getStringArray(R.array.data_description)
        val dataName = resources.getStringArray(R.array.data_name)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)

        val heroes = ArrayList<HeroModel>()
        dataName.indices.forEach { position ->
            val hero = HeroModel(photo = dataPhoto.getResourceId(position, -1), name = dataName[position], desc = dataDesc[position])
            heroes.add(hero)
        }
        return heroes
    }
}