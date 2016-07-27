package com.example.feelthemeal.feelthemeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.example.feelthemeal.feelthemeal.Switch.SwitchBreakfast;
import com.example.feelthemeal.feelthemeal.Switch.SwitchDessert;
import com.example.feelthemeal.feelthemeal.Switch.SwitchDinner;
import com.example.feelthemeal.feelthemeal.Switch.SwitchLunch;


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
        breakfastButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), SwitchBreakfast.class);
                startActivity(myIntent);
            }
        });
    //Lunch
        lunchButton = (ImageButton) findViewById(R.id.b2);
        lunchButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), SwitchLunch.class);
                startActivity(myIntent);
            }
        });

        //Dinner
        dinnerButton = (ImageButton) findViewById(R.id.b3);
        dinnerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), SwitchDinner.class);
                startActivity(myIntent);
            }
        });

        //Dessert
        dessertButton = (ImageButton) findViewById(R.id.b4);
        dessertButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), SwitchDessert.class);
                startActivity(myIntent);
            }
        });
    }
}
