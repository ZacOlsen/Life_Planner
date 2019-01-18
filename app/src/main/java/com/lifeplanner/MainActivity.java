package com.lifeplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button scheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scheduleButton = findViewById(R.id.scheduleButton);
        scheduleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showSchedulingActivity();
            }
        });
    }

    private void showSchedulingActivity(){
        Intent intent = new Intent(this, SchedulingActivity.class);
        startActivity(intent);
    }
}
