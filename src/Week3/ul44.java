package Week3;
import  java.util.Scanner;

public class ul44 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = reader.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = reader.nextInt();
        reader.close();

        least(number1, number2);
    }

    public static void least(int number1, int number2) {
        if (number1 < number2) {
            System.out.println("Least: " + number1);
        } else {
            System.out.println("Least: " + number2);
        }
    }
}
