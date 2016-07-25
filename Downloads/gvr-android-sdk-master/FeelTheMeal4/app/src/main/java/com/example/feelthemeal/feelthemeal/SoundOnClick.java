package com.example.feelthemeal.feelthemeal;

/**
 * Created by adder_000 on 7/25/2016.
 */
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SoundOnClick extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_buttons);
        Button one = (Button)this.findViewById(R.id.button);
        final MediaPlayer breakfastSoundMP = MediaPlayer.create(this, R.raw.breakfastnoise);
        one.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                breakfastSoundMP.start();
            }
        });
    }
}