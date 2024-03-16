package com.example.intentpassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnnext = findViewById(R.id.secondActivity);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iNext;
                iNext = new Intent(MainActivity.this,SecondActivity.class);

                iNext.putExtra("Title","Home");
                iNext.putExtra("Student Name","Raman");
                iNext.putExtra("Roll No",10);

                startActivity(iNext);
            }
        });
    }
}