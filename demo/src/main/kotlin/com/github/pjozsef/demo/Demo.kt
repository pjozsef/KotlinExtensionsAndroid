package com.github.pjozsef.demo

import android.util.Base64
import com.github.pjozsef.extension.android.base64.*

fun base64Demo(array : ByteArray){
    array.base64

    //instead of
    Base64.encodeToString(array, Base64.DEFAULT)
}