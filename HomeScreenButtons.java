package com.example.feelthemeal.feelthemeal;

import android.content.Intent;
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
    ImageButton myButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_buttons);
        myButton = (ImageButton)findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(v.getContext(), Breakfast.class);
                startActivity(myIntent);
            }
        });
    }
}
