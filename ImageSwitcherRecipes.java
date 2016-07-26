package com.example.feelthemeal.feelthemeal;

/**
 * Created by adder_000 on 7/26/2016.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.Random;

public class ImageSwitcherRecipes extends Activity {

    private static final String[] TEXTS = { "Image #1", "Image #2", "Image #3" };
    private static final int[] IMAGES = { R.mipmap.avocadotoast, R.mipmap.bananabread,
            R.mipmap.berrysmoothie };
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcherRecipes mImageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);

        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(ImageSwitcherRecipes.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcherRecipes) findViewById(R.id.imageSwitcher);
        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                return imageView;
            }
        });
        mImageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        mImageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);

        onSwitch(null);
    }

    public void onSwitch(View view) {
        //getRandom(IMAGES);
        
        //randomize the selection
        // int rand = new Random().nextInt(IMAGES.length);
        //mPosition = rand;
        mTextSwitcher.setText(TEXTS[mPosition]);
        mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);
        
        // mPosition = (mPosition + 1) % TEXTS.length;
        // mPosition = rand;
    }
