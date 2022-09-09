package Week3;

import java.util.Scanner;

public class ul69 {
    public static boolean palindrome(String text) {
String textReverse = "";
        int count = text.length();
        int i = count - 1;
        while (i >= 0) {
            textReverse = (text.charAt(i) + textReverse);
            i--;
        }
        return text.equals(textReverse);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
