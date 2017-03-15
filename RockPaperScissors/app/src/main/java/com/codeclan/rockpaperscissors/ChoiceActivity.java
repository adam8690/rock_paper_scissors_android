package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button){
        String inputString = "Rock";
        Intent intent = new Intent(this, WinnerActivity.class);
        intent.putExtra("input", inputString);

        startActivity(intent);
    }

    public void onPaperButtonClicked(View button){
        String inputString = "Paper";
        Intent intent = new Intent(this, WinnerActivity.class);
        intent.putExtra("input", inputString);

        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button){
        String inputString = "Scissors";
        Intent intent = new Intent(this, WinnerActivity.class);
        intent.putExtra("input", inputString);

        startActivity(intent);
    }


}
