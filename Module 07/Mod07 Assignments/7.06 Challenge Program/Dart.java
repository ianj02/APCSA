
/**
 * Write a description of class Darts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Dart {
    public static int hits(double x, double y, int trails) {
        double radius = 1.0;
        double numHits;
        x = (2 * Math.random() - 1);
        y = (2 * Math.random() - 1);
        numHits = 0;

        for (int i = 1; i < trails; i++) {
            x = (2 * Math.random() - 1);
            y = (2 * Math.random() - 1);

            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2))) {
                numHits++;
            }
        }
        return (int) numHits;
    }
    
    public static double calcPi(double numHits, double numThrows) {
        return (4 * (numHits) / numThrows);
    }

    public static void main(String[] args) {
        int numThrows, trails;
        double numX, numY, numHits, pi, avg, total = 0;
        double x = (2 * Math.random() - 1);
        double y = (2 * Math.random() - 1);
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many times should the dart be thrown per trial?");
        numThrows = in.nextInt();

        System.out.print("\n");

        System.out.println("How many trials do you want to simulate?");
        trails = in.nextInt();

        System.out.print("\n");

        for (int i = 0; i < trails; i++) {
            int hits = hits(x,y,numThrows);
            double estimatedPi = calcPi(hits,numThrows);
            total += estimatedPi;
            System.out.printf("Trial " + (i + 1) + ": pi = %12f\n", estimatedPi);
        }
        double averagePi = (total / trails);

        System.out.printf("Average Calculation of Pi: %1.5f", averagePi);
    }

}
