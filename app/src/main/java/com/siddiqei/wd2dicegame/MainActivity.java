package com.siddiqei.wd2dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button playButton;
    TextView textViewTurns,textViewScore;
    ImageView imageViewDice;
    int min,max;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton=findViewById(R.id.buttonPlay);
        textViewScore=findViewById(R.id.textViewscore);
        textViewTurns=findViewById(R.id.textViewtotalTurn);
        imageViewDice=findViewById(R.id.diceImage);
        min=1;
        max=6;


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random= new Random().nextInt((max-min)+1)+min;
                if(random==1)
                {
                    imageViewDice.setImageResource(R.drawable.dice1);
                }
                else if(random==2)
                {
                    imageViewDice.setImageResource(R.drawable.dice2);
                }
                else if(random==3)
                {
                    imageViewDice.setImageResource(R.drawable.dice3);
                }
                else if(random==4)
                {
                    imageViewDice.setImageResource(R.drawable.dice4);
                }
                else if(random==5)
                {
                    imageViewDice.setImageResource(R.drawable.dice5);
                }
                else if(random==6)
                {
                    imageViewDice.setImageResource(R.drawable.dice6);
                }
                textViewScore.setText(String.valueOf(random));
            }
        });


    }
}