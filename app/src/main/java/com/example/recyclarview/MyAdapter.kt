package com.example.recyclarview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<NewsDataClass>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.titleText.text = currentItem.title
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val titleText: TextView = itemView.findViewById(R.id.title_tv)


    }

}