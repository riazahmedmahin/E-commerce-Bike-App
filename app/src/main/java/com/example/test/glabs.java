package com.example.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class glabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glabs);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        View item = findViewById(R.id.nativation_home);

        @SuppressLint({"MissingInflatedId","LocalSuppress"})
        TextView bc = findViewById(R.id.bc);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        View item3 = findViewById(R.id.nativation_others);





        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), others.class);
                startActivity(intent);
            }
        });




        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), accoseries.class);
                startActivity(intent);
            }
        });
    }
}