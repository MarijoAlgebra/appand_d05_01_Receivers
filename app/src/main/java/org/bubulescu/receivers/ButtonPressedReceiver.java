package org.bubulescu.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class ButtonPressedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String text = "Button is pressed...";
        if (intent.hasExtra("key")) {
            text = intent.getStringExtra("key");
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setContentTitle("My Notification");
        builder.setContentText(text);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());

    }
}
