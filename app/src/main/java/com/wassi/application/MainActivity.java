package com.wassi.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton= findViewById(R.id.rollButton);
        final ImageView leftDice= findViewById(R.id.image_LeftDice);
        final ImageView rightDice= findViewById(R.id.image_RightDice);
        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("application","buton pressed");
                Random randomNumber6=new Random();
                int number1 = randomNumber6.nextInt(6);
                int number2 = randomNumber6.nextInt(6);

                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);
            }});
    }
}
