package com.demash.lrucache

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /***
         * Inserting bitmap to hashmap
         */
        val insertGetBitmap = InsertGetBitmap()
        insertGetBitmap.put("bitmap1", AMJBitmap("bitmap1"))
        insertGetBitmap.put("bitmap2", AMJBitmap("bitmap2"))
        insertGetBitmap.put("bitmap3", AMJBitmap("bitmap3"))
        insertGetBitmap.put("bitmap4", AMJBitmap("bitmap4"))
        insertGetBitmap.put("bitmap5", AMJBitmap("bitmap5"))
        insertGetBitmap.put("bitmap6", AMJBitmap("bitmap6"))
        insertGetBitmap.put("bitmap7", AMJBitmap("bitmap7"))
        insertGetBitmap.put("bitmap8", AMJBitmap("bitmap8"))
        insertGetBitmap.put("bitmap9", AMJBitmap("bitmap9"))
        insertGetBitmap.put("bitmap10", AMJBitmap("bitmap10"))

        insertGetBitmap.get("bitmap4")
        insertGetBitmap.get("bitmap8")


        /***
         *Older least used bitmap gets removed on adding new bitmap
         */
        insertGetBitmap.put("bitmap11", AMJBitmap("bitmap11"))
        insertGetBitmap.put("bitmap12", AMJBitmap("bitmap12"))


        /***
         * print data
         */
        insertGetBitmap.print()

    }
}





