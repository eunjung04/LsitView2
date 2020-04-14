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
            tempRow=inf.inflate(R.layout.app_list_item, null)
        }



        val row=tempRow!!

        val title = row.findViewById<TextView>(R.id.title)
        val companyName = row.findViewById<TextView>(R.id.companyName)
        val starImg1 = row.findViewById<ImageView>(R.id.star1)
        val starImg2 = row.findViewById<ImageView>(R.id.star2)
        val starImg3 = row.findViewById<ImageView>(R.id.star3)
        val starImg4 = row.findViewById<ImageView>(R.id.star4)
        val starImg5 = row.findViewById<ImageView>(R.id.star5)

        val data = mList.get(position)

        title.text = "${position+1}. ${data.name}"
        companyName.text = data.companyName

//        starImg1.setImageResource(R.drawable.fill_star)

        val starImgList = ArrayList<ImageView>()
        starImgList.add(starImg1)
        starImgList.add(starImg2)
        starImgList.add(starImg3)
        starImgList.add(starImg4)
        starImgList.add(starImg5)

        for (index in 0..4) {
            val starImg = starImgList.get(index)

            if (index < data.starCount) {
                starImg.setImageResource(R.drawable.star1)
            }
            else {
                starImg.setImageResource(R.drawable.star2)
            }

        }

        return row

    }

}