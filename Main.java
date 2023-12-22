import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int min = 1;
        int max = 100;
        int NoOfAttempts = 7;
        int rounds = 0;
        int totalRoundsWon = 0;
        int score = 0;
        do{
            int gen_num = (int)Math.floor(Math.random() * (max - min + 1 ) + min);
            System.out.println("Guess the number between 1 and 100: ");
            int attempts = 0;
            boolean correctguess = false;
            while(attempts < NoOfAttempts){
                int guess = sc.nextInt();
                attempts++;
                if(guess == gen_num){
                    System.out.println("Congratulations! You guessed it correct");
                    totalRoundsWon++;
                    score++;
                    correctguess = true;
                    break;
                } else if (guess > gen_num) {
                    System.out.println("It's Too High!!");
                } else {
                    System.out.println("It's Too Low!");
                }
            }
            if(!correctguess){
                System.out.println("Oops! You are out of attempts. The correct number was: "+gen_num);
            }
            rounds++;
            System.out.println("Do you wanna play again (Yes/No)? ");
        }while(sc.next().equalsIgnoreCase("yes"));
        System.out.println("GAME OVER!");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total Rounds Played: " +totalRoundsWon);
        System.out.println("Final Score: " + score);
    }
}
