package Week6;

public class ul97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] integerArray) {
        for ( int number: integerArray) {
            System.out.print(number + ", ");
        }
    }
}
