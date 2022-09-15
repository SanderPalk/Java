package Week1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ul18 {



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        String point = reader.nextLine();
        reader.close();

        int points = parseInt(point);

        if(points >= 0 && points <= 29) {
            System.out.println("Failed");
        } else if (points >= 30 && points <= 34) {
            System.out.println("Grade 1");
        } else if (points >= 35 && points <= 39) {
            System.out.println("Grade 2");
        } else if (points >= 40 && points <= 44) {
            System.out.println("Grade 3");
        } else if (points >= 45 && points <= 49) {
            System.out.println("Grade 4");
        } else if (points >= 50 && points <= 60) {
            System.out.println("Grade 5");
        } else {
            System.out.println("Insert correct points ");;
        }
    }
}
