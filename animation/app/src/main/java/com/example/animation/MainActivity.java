package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView imageView;
    private Button blinkBTN, rotateBTN, fadeBTN, moveBTN, slideBTN, zoomBTN, stopBTN;

    private ImageView img_android;
    private int level;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.textView);
        blinkBTN = findViewById(R.id.BTNblink);
        rotateBTN = findViewById(R.id.BTNrotate);
        fadeBTN = findViewById(R.id.BTNfade);
        moveBTN = findViewById(R.id.BTNmove);
        slideBTN = findViewById(R.id.BTNslide);
        zoomBTN = findViewById(R.id.BTNzoom);
        stopBTN = findViewById(R.id.BTNstop);

        img_android = findViewById(R.id.img_androids);
        level = 0;
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                img_android.setImageLevel(level);
                if (level == 4){
                    level = 0;
                }else {
                    level++;
                }
                handler.postDelayed(runnable, 1000);
            }
        };
        handler.postDelayed(runnable,1000);
        blinkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add blink animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                imageView.startAnimation(animation);
            }
        });

        rotateBTN.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                imageView.startAnimation(animation);
                return false;
            }
        });

//        rotateBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // To add rotate animation
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
//                imageView.startAnimation(animation);
//            }
//        });
        fadeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add fade animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
                imageView.startAnimation(animation);
            }
        });
        moveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add move animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
                imageView.startAnimation(animation);
            }
        });
        slideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add slide animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
                imageView.startAnimation(animation);
            }
        });
        zoomBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add zoom animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_animation);
                imageView.startAnimation(animation);
            }
        });
        stopBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To stop the animation going on imageview
                imageView.clearAnimation();
            }
        });
    }
}
