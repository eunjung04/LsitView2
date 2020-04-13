package com.example.lsitview2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AppAdapter(context: Context, resId:Int, list:ArrayList<App>): ArrayAdapter<App>(context,resId, list){

    val mContext=context
    val mList=list
    val inf=LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow=inf.inflate(R.layout.con_list_item, null)
        }



        val row=tempRow!!

        val star1=row.findViewById<ImageView>(R.id.star1)

        val star1=row.findViewById<TextView>(R.id.title)

        title.text="${position+1}.${data.name}"
        companyName.text=data.companyName


        val star1List=ArrayList<ImageView>()
        star1List.add(star1)
        star1List.add(star2)
        star1List.add(star3)
        star1List.add(star4)
        star1List.add(star5)

        for (index in 0..4){
            val star1=star1List.get(index)

            if(index < star1List.get(index)
        }

        return row

    }

}