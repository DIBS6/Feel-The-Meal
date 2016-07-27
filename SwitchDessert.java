package com.example.feelthemeal.feelthemeal.Switch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.feelthemeal.feelthemeal.R;


public class SwitchDessert extends Activity {

    private static final String[] TEXTS = {"Recipe #1 - Geneva was ranked as the world's ninth most important financial centre for competitiveness by the Global Financial Centres Index, ahead of Frankfurt, and third in Europe behind London and Zürich.[7] A 2009 survey by Mercer found that Geneva has the third-highest quality of life of any city in the world (behind Vienna and Zürich for expatriates; it is narrowly outranked by Zürich).[8] The city has been referred to as the world's most ", "Recipe #2", "Recipe #3 - compact metropolis[citation needed] and the \"Peace Capital\".[9] In 2009 and 2011, Geneva was ranked as, respectively, the fourth and fifth most expensive city in the world.[10"};
    private static final int[] IMAGES = {R.drawable.peanutbuttercookies, R.drawable.bananabread, R.drawable.berrysmoothie};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dessert);

        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(SwitchDessert.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(SwitchDessert.this);
                return imageView;
            }
        });
        mImageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        mImageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);

        onSwitch(null);
    }

    public void onSwitch(View view) {
        mTextSwitcher.setText(TEXTS[mPosition]);
        mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);
        mPosition = (mPosition + 1) % TEXTS.length;
    }
}