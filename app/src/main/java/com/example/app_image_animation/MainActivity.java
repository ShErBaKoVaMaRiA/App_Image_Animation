package com.example.app_image_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ImageCat1;
    ImageView ImageCat2;
    ImageView ImageCat3;
    ImageView ImageCat4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageCat1 = findViewById(R.id.image_cat1);
        ImageCat2 = findViewById(R.id.image_cat2);
        ImageCat3 = findViewById(R.id.image_cat3);
        ImageCat4 = findViewById(R.id.image_cat4);

        Button buttonAnim= findViewById(R.id.btn_anim);

        final Animation animationRotateCat1 = AnimationUtils.loadAnimation(
                this, R.anim.rotate_cat1);
        final Animation animationRotateCat2 = AnimationUtils.loadAnimation(
                this, R.anim.rotate_cat2);
        final Animation animationRotateCat3 = AnimationUtils.loadAnimation(
                this, R.anim.rotate_cat3);
        final Animation animationRotateCat4 = AnimationUtils.loadAnimation(
                this, R.anim.rotate_cat4);

        buttonAnim.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageCat1.startAnimation(animationRotateCat1);
                ImageCat2.startAnimation(animationRotateCat2);
                ImageCat3.startAnimation(animationRotateCat3);
                ImageCat4.startAnimation(animationRotateCat4);
            }
        });
    }
}