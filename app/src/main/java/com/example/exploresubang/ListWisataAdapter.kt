package com.example.exploresubang

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.exploresubang.ListWisataAdapter.ListViewHolder

class ListWisataAdapter(val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_wisata, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = wisata.name
        holder.tvDetail.text = wisata.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listWisata[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Wisata)
    }
}