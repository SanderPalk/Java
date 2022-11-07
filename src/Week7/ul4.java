package Week7;

public class ul4 {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks ( Container container ) {
        for ( int i = 1; i <= 100; i++ ) {
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
