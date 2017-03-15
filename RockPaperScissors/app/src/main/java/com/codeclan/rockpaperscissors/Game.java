package com.codeclan.rockpaperscissors;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class Game {

    String[] choices;
    String[] rps;


    public Game() {
        this.rps = new String[] {"Rock","Paper","Scissors"};
        this.choices = new String[2];
    }


    public void getPlayerChoice(String choice){
        choices[0] = choice;
    }


    public void getComputerChoice(){
        Random rand = new Random();
        int index = rand.nextInt(3);

        choices[1] = rps[index];
    }


    public String checkWinner() {
        if (Arrays.asList(choices).contains("Rock") && Arrays.asList(choices).contains("Scissors")){
            if (choices[0].equals("Rock")){
                return "Player wins!";
            }
            else{
                return "Computer wins!";
            }
        }
        else if (Arrays.asList(choices).contains("Scissors") && Arrays.asList(choices).contains("Paper")){
            if (choices[0].equals("Scissors")){
                return "Player wins!";
            }
            else {
                return "Computer wins!";
            }
        }
        else if (Arrays.asList(choices).contains("Paper") && Arrays.asList(choices).contains("Rock")){
            if (choices[0].equals("Paper")){
                return "Player wins!";
            }
            else {
                return "Computer wins!";
            }
        }

        return "It's a draw!";
    }
}
