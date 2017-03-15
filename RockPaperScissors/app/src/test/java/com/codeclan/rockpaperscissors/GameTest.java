package com.codeclan.rockpaperscissors;

import org.junit.*;
import static  org.junit.Assert.*;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class GameTest {

    Game testGame;

    @Before
    public void before(){
        testGame = new Game();
    }

    @Test
    public void canAddPlayerChoice(){
        testGame.getPlayerChoice("Rock");
        assertEquals("Rock",testGame.choices[0]);
    }

    @Test
    public void cangetComputerChoice(){
        testGame.getComputerChoice();
        assertNotNull(testGame.choices[1]);
    }

    @Test
    public void canCheckWinner1(){
        testGame.getPlayerChoice("Rock");
        testGame.choices[1] = "Scissors";
        String winMessage = testGame.checkWinner();
        assertEquals("Player wins!",winMessage);
    }

    @Test
    public void canCheckWinner2(){
        testGame.getPlayerChoice("Rock");
        testGame.choices[1] = "Paper";
        String winMessage = testGame.checkWinner();
        assertEquals("Computer wins!",winMessage);
    }

    @Test
    public void canCheckWinner3(){
        testGame.getPlayerChoice("Rock");
        testGame.choices[1] = "Rock";
        String winMessage = testGame.checkWinner();
        assertEquals("It's a draw!",winMessage);
    }


}
