package com.github.pjozsef.extension.android.intent

import android.content.Context
import android.content.Intent

fun Context.startService(type: Class<*>, init: Intent.() -> Unit) {
    val intent = Intent(this, type);
    intent.init()
    startService(intent);
}

fun Context.startActivity(type:Class<*>, init: Intent.() -> Unit){
    val intent = Intent(this,type)
    intent.init()
    startActivity(intent)
}