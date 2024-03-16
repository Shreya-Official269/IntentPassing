package com.example.intentpassing;

import static com.example.intentpassing.R.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_second);

        Intent frommain = getIntent();

        String title = frommain.getStringExtra("title");
        String studentname =  frommain.getStringExtra("Student Name");
        int rollno = frommain.getIntExtra("Roll No",0);

        getSupportActionBar().setTitle(title);



    }
}