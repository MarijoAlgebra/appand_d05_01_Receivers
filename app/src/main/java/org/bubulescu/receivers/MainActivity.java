package org.bubulescu.receivers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSendBcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendBcast = findViewById(R.id.btnSendBcast);

        btnSendBcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bcast = new Intent("org.bubulescu.broadcast.BUTTON_PRESSED");
                // bcast.setAction("org.bubulescu.broadcast.BUTTON_PRESSED");
                bcast.putExtra("key", "Sample extra message...");
                sendBroadcast(bcast);
            }
        });
    }
}
