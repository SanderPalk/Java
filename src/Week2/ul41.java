package Week2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ul41 {


    public static void main(String[] args) {

        int rightNumber = drawCard();
        int i = 0;
        while(true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Guess a number: ");
            int guess = parseInt(reader.nextLine());

            if(guess > rightNumber) {
                i++;
                System.out.println("The number is lesser, guesses made " + i);
            } else if(guess < rightNumber) {
                i++;
                System.out.println("The number is greater, guesses made " + i);
            } else {
                System.out.println("Congratulations, your guess is correct! Guesses made: " + i);
            }

        }
    }

    private static int drawCard() {
        int min = 0;
        int max = 100;
//Generate random int value from 200 to 400
        return (int)(Math.random()*(max-min+1)+min);
    }
}
