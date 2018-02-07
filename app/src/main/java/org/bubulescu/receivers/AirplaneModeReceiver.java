package org.bubulescu.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AirplaneModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent startMyApp = new Intent(context, MainActivity.class);
        // startMyApp.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startMyApp);
    }
}
