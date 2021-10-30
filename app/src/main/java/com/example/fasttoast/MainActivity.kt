package com.example.fasttoast

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FastToast {
    companion object {
        fun create(context: Context, message:String, duration:Int){
            Toast.makeText(context,message,duration).show()
        }
    }

}