package Week4;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "NAME: " + this.name + "  PRICE: " + this.price + "  AMOUNT: " + this.amount;
    }
}
