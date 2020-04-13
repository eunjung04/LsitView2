package com.example.lsitview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var mAppAdapter:AppAdapter?=null

    val appList=ArrayList<App>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appList.add(App("아스팔트 8 : 에어본", "GameLoft", 5))
        appList.add(App("MineCraft", "Mojang", 4))
        appList.add(App("아스팔트 7 : 히트", "GameLoft", 4))
        appList.add(App("팔라독 (Paladog)", "FazeCat", 2))
        appList.add(App("Plants vs. Zombies", "EA Games", 3))
        appList.add(App("스왐피 (Swampy)", "Disney", 5))
        appList.add(App("리니지2M", "NCSOFT", 3))
        appList.add(App("리니지M", "NCSOFT", 4))
        appList.add(App("AFK아레나", "Lilith Games", 1))


        mAppAdapter=AppAdapter(this, R.layout.app_list_item,appList)


    }
}
