package Week7;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Reader {

    public static String readString() {
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static int readInteger() {
        return parseInt(readString());
    }
}
