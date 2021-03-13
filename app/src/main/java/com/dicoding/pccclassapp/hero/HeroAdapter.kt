package com.dicoding.pccclassapp.hero

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.pccclassapp.R

class HeroAdapter(private val listHero: ArrayList<HeroModel>) : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.hero_item, parent, false)

        return HeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = listHero[position]
        holder.bind(hero)
    }

    override fun getItemCount(): Int = listHero.size

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.txt_name)
        private val desc: TextView = itemView.findViewById(R.id.txt_description)
        private val image: ImageView = itemView.findViewById(R.id.img_photo)
        fun bind(hero: HeroModel) {
            // set data
            name.text = hero.name
            desc.text = hero.desc
            image.setImageResource(hero.photo)
        }
    }
}
