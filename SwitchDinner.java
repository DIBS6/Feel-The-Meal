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


public class SwitchDinner extends Activity {

    private static final String[] TEXTS = {"Recipe #1 - The area which became the town of Concord was originally known as Musketaquid, an Algonquian word for grassy plain. It was one of the scenes of the Battle of Lexington and Concord, the initial conflict in the American Revolutionary War. It developed into a remarkably rich literary center during the mid-nineteenth century. Featured were Ralph Waldo Emerson, Nathaniel Hawthorne, Bronson Alcott, Louisa May Alcott and Henry David Thoreau, all of whose homes are preserved in modern-day Concord. The now-ubiquitous Concord grape was developed here.", "Recipe #2", "Recipe #3"};
    private static final int[] IMAGES = {R.drawable.mushroomomelette, R.drawable.chickennoodlesoup, R.drawable.avocadotoast};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner);

        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(SwitchDinner.this);
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
                ImageView imageView = new ImageView(SwitchDinner.this);
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