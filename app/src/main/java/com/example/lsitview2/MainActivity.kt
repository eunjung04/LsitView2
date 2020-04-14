package com.example.lsitview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mAppAdapter:AppAdapter?=null

    val apps=ArrayList<App>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()




    }

    fun setupEvents(){

    }

    fun setValues(){

        mAppAdapter = AppAdapter(this, R.layout.app_list_item, apps)
        appListView.adapter = mAppAdapter

    }

    fun addApps(){

        apps.add(App("아스팔트 8 : 에어본", "GameLoft", 5))
        apps.add(App("MineCraft", "Mojang", 4))
        apps.add(App("아스팔트 7 : 히트", "GameLoft", 4))
        apps.add(App("팔라독 (Paladog)", "FazeCat", 2))
        apps.add(App("Plants vs. Zombies", "EA Games", 3))
        apps.add(App("스왐피 (Swampy)", "Disney", 5))
        apps.add(App("리니지2M", "NCSOFT", 3))
        apps.add(App("리니지M", "NCSOFT", 4))
        apps.add(App("AFK아레나", "Lilith Games", 1))

    }
}
