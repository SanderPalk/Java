package Week3;
import java.util.Scanner;

public class ul56 {
    public static String reverse(String text) {
        String textReverse = "";
        int count = text.length();
        int i = count - 1;
        while (i >= 0) {
            textReverse = (text.charAt(i) + textReverse);
            i--;
        }
        return textReverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
