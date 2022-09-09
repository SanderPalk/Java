package Week2;
import java.util.Scanner;

public class ul38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputValue = reader.nextInt();
        reader.close();

        int i = 0;
        while (i < inputValue) {
            printTest();
            i++;
        }
    }

    public static void printTest() {
        System.out.println("Many worlds");
    }
}
