package com.example.mhjg43.kotlinrecycler
/*
                    .-=====-.
                    | .""". |
                    | |   | |
                    | |   | |
                    | '---' |
                    |       |
                    |       |
 .-================-'       '-================-.
j|  _                                          |
g|.'o\                                    __   |
s| '-.'.                                .'o.`  |
 '-==='.'.=========-.       .-========.'.-'===-'
        '.`'._    .===,     |     _.-' /
          '._ '-./  ,//\   _| _.-'  _.'
             '-.| ,//   \-'  `   .-'
                `// _`--;    ;.-'
                  `\._ ;|    |
                     \`-'  . |
                     |_.-'-._|
                     \  _'_  /
                     |; -:- |
                     || -.- \
                     |;     .\
                     / `'\'`\-;
                    ;    '. `_/
                    |,`-._;  .`|
                    `;\  `.-'-;
                     | \   \  |
                     |  `\  \ |
                     |   )  | |
                     |  /  /` /
                     | |  /|  |
                     | | / | /
                     | / |/ /|
                     | \ / / |
                     |  /o | |
                     |  |_/  |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     '-=====-'
                  God Bless No Bug
*/

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (private val dataSet: ArrayList<DataModel>): RecyclerView.Adapter<CustomAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cards_layout,parent,false)
        val myViewHolder = MyViewHolder(view)
        view.setOnClickListener(MainActivity.myOnClickListener)

        return myViewHolder
    }



    override fun onBindViewHolder(holder : MyViewHolder, listPosition: Int) {

        val textViewName = holder.textViewName
        val textViewVersion = holder.textViewVersion
        val imageView = holder.imageViewIcon

        textViewName.text = dataSet[listPosition].name
        textViewVersion.text = dataSet[listPosition].version
        imageView.setImageResource(dataSet[listPosition].image)
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        internal var textViewName: TextView
        internal var textViewVersion: TextView
        internal var imageViewIcon: ImageView

        init {
            this.textViewName = itemView.findViewById(R.id.name) as TextView
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion) as TextView
            this.imageViewIcon = itemView.findViewById(R.id.imageView) as ImageView
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}