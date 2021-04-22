package com.example.flashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {


         ImageView imageView2,imageView;
          LottieAnimationView animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                          imageView = (ImageView)findViewById(R.id.imageView);
                          imageView2 = (ImageView)findViewById(R.id.imageView2);

                          animation = (LottieAnimationView)findViewById(R.id.animation);


                          imageView.animate().translationY(-1600).setDuration(2000).setStartDelay(4000);
                          imageView2.animate().translationY(-1400).setDuration(2000).setStartDelay(4000);
                          animation.animate().translationY(1400).setDuration(5000).setStartDelay(4000);




    }
}