package com.example.recyclerinkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class Adapter( private  var foodlist:ArrayList<Model>):
    RecyclerView.Adapter<Adapter.Viewholder>() {


        class Viewholder(itemView: View):RecyclerView.ViewHolder(itemView){
            val imageView:ImageView=itemView.findViewById(R.id.imageView)
            val  textView: TextView=itemView.findViewById(R.id.textView)


        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.source,parent,false))
    }

    override fun getItemCount(): Int {
        return foodlist.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val food=foodlist[position]
        holder.imageView.setImageResource(food.img)
        holder.textView.text=food.name

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,MainActivity2::class.java)
            intent.putExtra("image",foodlist[position].name)
            intent.putExtra("name",foodlist[position].img)
           holder.itemView.context.startActivity(intent)
        }
    }


}
