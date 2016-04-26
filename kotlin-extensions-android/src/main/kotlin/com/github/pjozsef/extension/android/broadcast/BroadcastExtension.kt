package com.github.pjozsef.extension.android.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter

fun Context.broadcast(a: Intent.() -> Unit) {
    val intent = Intent();
    intent.a()
    sendBroadcast(intent);
}

fun Context.registerReceiver(receiver: BroadcastReceiver, vararg actions: String) {
    val filter = IntentFilter();
    actions.forEach {
        filter.addAction(it)
    }
    registerReceiver(receiver, filter);
}

class Receiver(val onReceiveCallback: (Context?, Intent?) -> Unit) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) = onReceiveCallback(context, intent)
}