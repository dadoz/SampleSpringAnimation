package com.sample.davidelmn.samplespringanimation;

import android.os.Bundle;
import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInitView();
    }

    private void onInitView() {
        findViewById(R.id.animateButtonId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAnimateView();
            }
        });
    }

    void onAnimateView() {
        View view = findViewById(R.id.animatedCardviewId);
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.TRANSLATION_Y, 0);
        springAnimation.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
        springAnimation.setStartValue(1200);
        springAnimation.start();
    }
}
