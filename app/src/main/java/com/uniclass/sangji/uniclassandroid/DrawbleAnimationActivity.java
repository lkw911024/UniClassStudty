package com.uniclass.sangji.uniclassandroid;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.ImageView;

public class DrawbleAnimationActivity extends AppCompatActivity {
    public AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawble_animation);
        ImageView rocketImage = (ImageView) findViewById(R.id.rocketImage);
        rocketImage.setBackgroundResource(R.drawable.rocket);
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
    }

    public boolean onTouchEvent(MotionEvent event)
    {
        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            rocketAnimation.start();
            return true;
        }

        return super.onTouchEvent(event);
    }
}
