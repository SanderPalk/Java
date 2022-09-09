package Week3;
import java.util.Scanner;

public class ul48 {
    public static void average(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        double average = sum / 4.0;
        System.out.println("The average is " + average);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = reader.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = reader.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = reader.nextInt();
        System.out.println("Enter the fourth number: ");
        int number4 = reader.nextInt();
        reader.close();

        average(number1, number2, number3, number4);
    }
}
