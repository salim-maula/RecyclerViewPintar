package com.salim.recyclerviewpintar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_portofolio.view.*

class AdapterPortofolio(val listPortofolio:ArrayList<ModelPortofolio>)
        //kita akan mengextend
    :RecyclerView.Adapter<AdapterPortofolio.MyHolder>()
{
    inner class MyHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPortofolio.MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_portofolio, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterPortofolio.MyHolder, position: Int) {
       holder.itemView.tv_judul.text = listPortofolio.get(position).namaPortofolio
        Glide.with(holder.itemView.context)
                .load(listPortofolio[position].imagePortofolio)
                .into(holder.itemView.img_portofolio)

        //cara membuat agar item bisa di klik
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,
            DetailActivity::class.java)
            intent.putExtra("NAMA", listPortofolio[position].namaPortofolio)
            intent.putExtra("DETAIL", listPortofolio[position].detail)
            intent.putExtra("IMAGE", listPortofolio[position].imagePortofolio)

            //start activity untuk menjalankan perintahnya
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listPortofolio.size
    }

}