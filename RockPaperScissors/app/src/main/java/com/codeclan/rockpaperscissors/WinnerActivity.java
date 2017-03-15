package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    TextView playerMessage;
    TextView computerMessage;
    TextView winMessage;
    Game game;
    Button replayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String choice = extras.getString("input");

        game = new Game();
        game.getPlayerChoice(choice);
        game.getComputerChoice();
        String playerChoice = game.choices[0];
        String computerChoice = game.choices[1];
        String output = game.checkWinner();

        playerMessage = (TextView)findViewById(R.id.player_choice);
        playerMessage.setText("You chose " + playerChoice);

        computerMessage = (TextView)findViewById(R.id.computer_choice);
        computerMessage.setText("Computer chooses " + computerChoice);

        winMessage = (TextView)findViewById(R.id.result);
        winMessage.setText(output);

        replayButton = (Button) findViewById(R.id.replay);


    }

    public void onReplayButtonPressed(View button) {
        Intent intent = new Intent(this, ChoiceActivity.class);

        startActivity(intent);

    }



}
