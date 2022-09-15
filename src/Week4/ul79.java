package Week4;
import java.util.Scanner;

public class ul79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type numbers: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        while (true) {
            number = reader.nextInt();
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
        }
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
    }
}
