package com.example.notificationexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "Coder";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Notification builder = new NotificationCompat.Builder(MainActivity.this,CHANNEL_ID)
                        .setContentTitle("通知!!")
                        .setContentText("test")
                        .setSmallIcon(R.drawable.ic_launcher_foreground).build();

                NotificationManagerCompat notificationManagerCompat
                        = NotificationManagerCompat.from(MainActivity.this);

                notificationManagerCompat.notify(1,builder);

            }
        });
    }
}