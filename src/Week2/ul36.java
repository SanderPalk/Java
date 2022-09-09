package Week2;
import java.util.Scanner;

public class ul36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputValue = input.nextInt();

        int sum = 0;
        int count = 0;
        while (true) {
            if (inputValue == -1) {
                break;
            }
            sum += inputValue;
            count++;
        }

        System.out.println(inputValue);
        System.out.println("The sum is" + sum);
        System.out.println(count + " numbers were entered");
        System.out.println("The average is " + (sum / count));
    }
}
