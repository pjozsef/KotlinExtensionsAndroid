package com.github.pjozsef.demo

import android.content.*
import android.util.Base64
import com.github.pjozsef.extension.android.base64.*
import com.github.pjozsef.extension.android.broadcast.broadcast
import com.github.pjozsef.extension.android.broadcast.registerReceiver
import com.github.pjozsef.extension.android.intent.startActivity
import com.github.pjozsef.extension.android.intent.startService
import com.github.pjozsef.extension.android.sharedpreferences.edit
import com.github.pjozsef.extension.android.sharedpreferences.set

fun base64Demo(array : ByteArray){
    array.base64

    //instead of
    Base64.encodeToString(array, Base64.DEFAULT)
}

fun broadcastDemo(context: Context){
    context.broadcast {
        action = "DEMO_ACTION"
        putExtra("DEMO_EXTRA", 10)
    }

    //instead of
    val intent = Intent();
    intent.action = "DEMO_ACTION"
    intent.putExtra("DEMO_EXTRA", 10)
    context.sendBroadcast(intent);
}

fun registerReceiverDemo(context: Context, receiver: BroadcastReceiver){
    context.registerReceiver(receiver, "ACTION1", "ACTION2", "ACTION3")

    //instead of
    val filter = IntentFilter();
    filter.addAction("ACTION1")
    filter.addAction("ACTION2")
    filter.addAction("ACTION3")
    context.registerReceiver(receiver, filter);
}

fun startServiceDemo(context: Context, type: Class<*>){
    context.startService(type) {
        action = "DEMO_ACTION"
        putExtra("DEMO_EXTRA", 10)
    }

    //instead of
    val intent = Intent(context, type);
    intent.action = "DEMO_ACTION"
    intent.putExtra("DEMO_EXTRA", 10)
    context.startService(intent);
}

fun startActivityDemo(context: Context, type: Class<*>){
    context.startActivity(type) {
        putExtra("DEMO_EXTRA", 10)
    }

    //instead of
    val intent = Intent(context, type);
    intent.putExtra("DEMO_EXTRA", 10)
    context.startActivity(intent);
}

fun sharedPreferencesDemo(prefs: SharedPreferences){
    prefs.edit {
        set("KEY1" to "VALUE1")
        set("KEY2" to 15)
        set("KEY3" to true)
    }

    //instead of
    val editor = prefs.edit()
    editor.putString("KEY1", "VALUE1")
    editor.putInt("KEY2", 15)
    editor.putBoolean("KEY3", true)
    editor.apply()
}