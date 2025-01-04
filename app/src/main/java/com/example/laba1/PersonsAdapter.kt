package com.example.laba1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonsAdapter(var persons: List<Persons>, var context: Context) : RecyclerView.Adapter<PersonsAdapter.MyViewHolder> () {

    class MyViewHolder (view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.person_list_image)
        val PersonName: TextView = view.findViewById(R.id.person_name)
        val Nation: TextView = view.findViewById(R.id.person_nation)
        val Prof: TextView = view.findViewById(R.id.person_prof)
        val Home: TextView = view.findViewById(R.id.person_home)
        val btn: Button = view.findViewById(R.id.persom_list_button)



    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.person_in_list,parent, false)
        return  MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return persons.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.PersonName.text=persons[position].name
        holder.Nation.text=persons[position].nation
        holder.Prof.text=persons[position].prof
        holder.Home.text=persons[position].home
        val imageid=context.resources.getIdentifier(
            persons[position].image.toString(),
            "drawable",
            context.packageName

        )

        holder.image.setImageResource(imageid)

        holder.btn.setOnClickListener {
            val intent = Intent (context, PersonaActivity1::class.java)

            intent.putExtra("personName", persons[position].name )
            intent.putExtra("personInfo", persons[position].inf )

            context.startActivity(intent)

        }

    }

}