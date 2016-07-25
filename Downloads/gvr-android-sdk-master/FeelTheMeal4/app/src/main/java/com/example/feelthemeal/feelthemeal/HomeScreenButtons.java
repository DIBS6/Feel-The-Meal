package com.example.feelthemeal.feelthemeal;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreenButtons extends AppCompatActivity {
    ImageButton breakfastButton = null;
    ImageButton lunchButton = null;
    ImageButton dinnerButton = null;
    ImageButton dessertButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_buttons);

        //Breakfast
        breakfastButton = (ImageButton) findViewById(R.id.b1);
        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Breakfast.class);
                startActivity(myIntent);
            }
        });

        //Lunch
        lunchButton = (ImageButton) findViewById(R.id.b2);
        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Lunch.class);
                startActivity(myIntent);
            }
        });

        //Dinner
        dinnerButton = (ImageButton) findViewById(R.id.b3);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Dinner.class);
                startActivity(myIntent);
            }
        });

        //Dessert
        dessertButton = (ImageButton) findViewById(R.id.b4);
        dessertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Dessert.class);
                startActivity(myIntent);
            }
        });
    }
}
