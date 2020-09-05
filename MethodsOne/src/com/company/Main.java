package com.company;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5 , 100);
        System.out.println("Your Final Score = " + finalScore);

        finalScore = calculateScore(false, 10000,8,200);
        System.out.println("Your Final Score = " + finalScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Praveen",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Gokul",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Pradeep", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Yasir", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        return 4;
    }

    public  static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table!!!");
    }
}
