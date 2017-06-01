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

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view) as RecyclerView
        myOnClickListener = MyOnClickListener(this)

        recyclerView!!.setHasFixedSize(true)

        layoutManager  = LinearLayoutManager(this)

        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()

        data = ArrayList<DataModel>()

        for (i in MyData.nameArray.indices){
            data!!.add(DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]))
        }

        adapter = CustomAdapter(data!!)
        recyclerView!!.adapter = adapter
    }

    private class MyOnClickListener constructor(private val context: Context) : View.OnClickListener{
        override fun onClick(v: View) {
            var selectedItemPosition = recyclerView!!.getChildLayoutPosition(v)

            Toast.makeText(context, "$selectedItemPosition", Toast.LENGTH_LONG).show()
        }
    }

    companion object {


        private var adapter: RecyclerView.Adapter<*>? = null
        private var recyclerView: RecyclerView? = null
        private var data: ArrayList<DataModel>? = null
        internal var myOnClickListener: View.OnClickListener? = null
        private var removedItems: ArrayList<Int>? = null
    }
}
