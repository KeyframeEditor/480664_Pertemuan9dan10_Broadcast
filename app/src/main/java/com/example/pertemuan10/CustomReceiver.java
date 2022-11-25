package com.example.pertemuan10;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if (intentAction != null){
            String toastMessage = "unknown";
            switch (intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power Connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power Disconnected";
                    break;
                case "action-custom-broadcast":
                    toastMessage = "CUSTOM BROADCAST IS RECIEVED";
                    break;
            }
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}