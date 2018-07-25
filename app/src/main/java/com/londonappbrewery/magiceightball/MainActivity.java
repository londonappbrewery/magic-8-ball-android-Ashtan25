package com.londonappbrewery.magiceightball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton=findViewById(R.id.askButton);
        final ImageView image_eightBall=findViewById(R.id.image_eightBall);
        final int[] imageArray=new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber=new Random();
                int number=randomNumber.nextInt(4);

                image_eightBall.setImageResource(imageArray[number]);

            }
        });



    }
}
