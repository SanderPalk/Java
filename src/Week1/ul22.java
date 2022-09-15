package Week1;

import java.util.Scanner;

public class ul22 {

    private static String thePassword = "carrot";

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the password: ");
        String password = reader.nextLine();

        while (true) {
            if(password.equals(thePassword)) {
                System.out.println("The secret key is: jryyy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
                break;
            }
        }
    }
}
