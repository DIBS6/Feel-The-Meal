package com.example.feelthemeal.feelthemeal.Switch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.ImageSwitcher;

import com.example.feelthemeal.feelthemeal.R;


public class SwitchBreakfast extends Activity {

    private static final String[] TEXTS = {"Recipe #1 - The charter became part of English political life and was typically renewed by each monarch in turn, although as time went by and the fledgling English Parliament passed new laws, it lost some of its practical significance. At the end of the 16th century there was an upsurge in interest in Magna Carta. Lawyers and historians at the time believed that there was an ancient English constitution, going back to the days of the Anglo-Saxons, that protected individual English freedoms. They argued that the Norman invasion of 1066 had overthrown these rights, and that Magna Carta had been a popular attempt to restore them, making the charter an essential foundation for the contemporary powers of Parliament and legal principles such as habeas corpus. Although this historical account was badly flawed, jurists such as Sir Edward Coke used Magna Carta extensively in the early 17th century, arguing against the divine right of kings propounded by the Stuart monarchs. Both James I and his son Charles I attempted to suppress the discussion of Magna Carta, until the issue was curtailed by the English Civil War of the 1640s and the execution of Charles.", "Recipe #2", "Recipe #3"};
    private static final int[] IMAGES = {R.drawable.scrambledeggs, R.drawable.bananabread, R.drawable.berrysmoothie};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);

        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(SwitchBreakfast.this);
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
                ImageView imageView = new ImageView(SwitchBreakfast.this);
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
        //getRandom(IMAGES):
+       //int rand = new Random().nextInt(ARRAY.length);
+        //mPosition = rand;

    }
}
