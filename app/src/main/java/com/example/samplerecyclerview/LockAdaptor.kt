package com.example.samplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LockAdaptor: RecyclerView.Adapter<LockAdaptor.BankViewHolder>() {

    class BankViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val img12: ImageView = itemView.findViewById(R.id.imageV1)
        val text12: TextView = itemView.findViewById(R.id.textV1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item_view,parent,false)
        return BankViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: BankViewHolder, position: Int) {

        holder.text12.text="Security"
        holder.img12.setImageResource(R.drawable.baseline_safety_check_24)
    }
}