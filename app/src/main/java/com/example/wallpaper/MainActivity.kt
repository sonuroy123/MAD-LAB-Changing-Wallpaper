package com.example.wallpaper

import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeWallpaper(view : View?){
        var img = arrayOf(R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5)
        var r= Random()
        var i=r.nextInt(5)

        var w = WallpaperManager.getInstance(applicationContext)

            w.setResource(img[i])
            Thread.sleep(10000)
            changeWallpaper(view)
    }

}