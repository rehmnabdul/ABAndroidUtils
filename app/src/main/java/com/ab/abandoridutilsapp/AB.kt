package com.ab.abandoridutilsapp

import android.content.Context
import android.widget.TextView
import com.ab.andoridutils.extensions.*

class AB(context: Context, myText: TextView) {

    init {

        context.runOnBackgroundThread(object : Runnable{
            override fun run() {

                myText.text = "From Background Thread"

                context.runOnUiThread(object : Runnable{

                    override fun run() {
                        myText.text = "From Main Thread Again"

                    }
                })
            }
        })

    }

}