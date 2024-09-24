package com.tollcafe.networkrequestpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HotkeyAdapter(private val hotkeyList: List<Hotkey>) :
    RecyclerView.Adapter<HotkeyAdapter.HotkeyViewHolder>() {
    inner class HotkeyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView = itemView.findViewById(R.id.tv_name)
        val linkTextView: TextView = itemView.findViewById(R.id.tv_link)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotkeyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_hotkey,parent,false)
        return HotkeyViewHolder(view)
    }

    override fun getItemCount()=hotkeyList.size

    override fun onBindViewHolder(holder: HotkeyViewHolder, position: Int) {
        val hotkey=hotkeyList[position]
        holder.nameTextView.text=hotkey.name
        holder.linkTextView.text=hotkey.link

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Clicked:$hotkey ", Toast.LENGTH_SHORT).show()
        }
    }
}