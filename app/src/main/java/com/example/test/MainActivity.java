package com.example.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    ImageView imageMenu;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navagation Drawar------------------------------
        drawerLayout = findViewById(R.id.drawer_layout);

        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        CardView back = findViewById(R.id.upcomming);
        CardView back1 = findViewById(R.id.cardhome);




        CardView acco = findViewById(R.id.carddoctor);

        CardView order = findViewById(R.id.cardorder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });





        acco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), accoseries.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), upcomming.class);
                startActivity(intent);
            }
        });



        //

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bike.class);
                startActivity(intent);
            }
        });





        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Drawar click event
        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mHome:
                        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mRate:
                        Toast.makeText(MainActivity.this, "Rating", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), rating.class);
                        startActivity(intent);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.mOrder:
                        Toast.makeText(MainActivity.this, "Order Review", Toast.LENGTH_SHORT).show();
                        Intent ointent = new Intent(getApplicationContext(),order.class);
                        startActivity(ointent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mClose:
                        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;


                }

                return false;
            }
        });
        //------------------------------

        // ------------------------
        // App Bar Click Event
        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });



    }
}
