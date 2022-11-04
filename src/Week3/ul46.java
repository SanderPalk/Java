package Week3;

public class ul46 {
    public static void main(String[] args) {
        double answer = average( 4, 3, 6, 1);
        System.out.println("average " + answer);
    }

    public static double average(double number1, double number2, double number3, double number4) {
        return (number1 + number2 + number3 + number4) / 4;
    }
}
