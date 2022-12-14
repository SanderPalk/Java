package Week7;

public class Thing {
    private String name;
    private int weight;

    public Thing ( String name, int weight ) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return getName() + " (" + getWeight() + "kg)";
    }
}
