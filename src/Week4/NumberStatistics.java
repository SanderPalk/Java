package Week4;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    private int number;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / this.amountOfNumbers;
    }
}
