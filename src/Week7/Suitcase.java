package Week7;

import java.util.ArrayList;

public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> things;

    public Suitcase( int weightLimit ) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing ( Thing thing ) {
        int currentWeight = this.totalWeight();
        if( currentWeight + thing.getWeight() <= this.weightLimit ) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for ( Thing currentThing : this.things ) {
            currentWeight += currentThing.getWeight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        if ( this.things.size() == 0 ) {
            return "Suitcase is empty";
        } else if ( this.things.size() == 1 ) {
            return "1 thing " + "( " + totalWeight() + " kg)";
        } else {
            return this.things.size() + " things " + "( " + totalWeight() + " kg)";
        }
    }

    public void printThings() {
        for ( Thing currentThing : this.things ) {
            System.out.println( currentThing.toString());
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = new Thing("", 0);
        for ( Thing currentThing : this.things ) {
            if (currentThing.getWeight() > heaviest.getWeight()) {
                heaviest = currentThing;
            }
        }
        if( this.things.size() == 0 ) return null;
        return heaviest;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }
}
