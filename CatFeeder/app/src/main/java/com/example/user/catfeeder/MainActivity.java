package com.example.user.catfeeder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button addJadwal;
    private Button feedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Alarm = (Button) findViewById(R.id.addJadwal);
        Button feed = (Button) findViewById(R.id.feedButton);

        Alarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
