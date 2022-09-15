package Week7;

public class Calculator {

    private int calculations = 0;
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = Reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        this.calculations++;

        System.out.print("value1: ");
        int value1 = Reader.readInteger();
        System.out.print("value2: ");
        int value2 = Reader.readInteger();

        int finalValue = value1 + value2;

        System.out.print("sum = " + finalValue + System.lineSeparator());
    }

    private void difference() {
        this.calculations++;

        System.out.print("value1: ");
        int value1 = Reader.readInteger();
        System.out.print("value2: ");
        int value2 = Reader.readInteger();

        int finalValue = value1 - value2;

        System.out.print("difference = " + finalValue + System.lineSeparator());
    }

    private void product() {
        this.calculations++;

        System.out.print("value1: ");
        int value1 = Reader.readInteger();
        System.out.print("value2: ");
        int value2 = Reader.readInteger();

        int finalValue = value1 * value2;

        System.out.print("product = " + finalValue + System.lineSeparator());
    }

    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
}

