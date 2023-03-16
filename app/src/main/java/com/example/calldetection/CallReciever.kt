package com.example.calldetection

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.calldetectionservice.callDetectionService

class CallReciever : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        callDetectionService.callDetection(context, intent)

    }
}