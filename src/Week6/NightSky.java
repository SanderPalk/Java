package Week6;
import java.lang.Math;

public class NightSky {

    static double density;
    static int width;
    static int height;
    static int starsInLastPrint;

    public NightSky(double givenDensity) {
        density = givenDensity;
        width = 20;
        height = 10;
        starsInLastPrint = 0;
    }

    public NightSky(int givenWidth, int givenHeight){
        density = 0.1;
        width = givenWidth;
        height = givenHeight;
        starsInLastPrint = 0;
    }

    public NightSky( double givenDensity, int givenWidth, int givenHeight ) {
        density = givenDensity;
        width = givenWidth;
        height = givenHeight;
        starsInLastPrint = 0;
    }

    public static void printLine() {
        for (int i = 1; i <= width; i++) {

            double roll = Math.random();

            if (density >= roll) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public static int getStarsInLastPrint() {
        return starsInLastPrint;
    }

    public static void print() {
        for( int i=1; i <= height; i++) {
            printLine();

            System.out.println();
        }
        System.out.println("Star count: " + getStarsInLastPrint());
    }

    public static void main(String[] args) {
        NightSky nightSky = new NightSky(10, 5);
        print();
    }
}
