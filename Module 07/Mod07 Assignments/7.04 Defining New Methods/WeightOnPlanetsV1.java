
/**
 * Write a description of class WeightOnPlanetsV1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class WeightOnPlanetsV1
{
    public static String [] planets()
    {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        return planets;
    }
    
    public static double [] surfaceGrav() throws IOException
    {
        int index = 0;
        double [] surfaceGrav = new double [8];
        
        File fileName = new File("gravity.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNextDouble())
        {
            surfaceGrav[index] = inFile.nextDouble();
            surfaceGrav[index] /= 10;
            index++;
        }
        surfaceGrav[2] = Math.round(surfaceGrav[2]);
        inFile.close();
        return surfaceGrav;
    }
    
    public static double [] surfaceGravAct() throws IOException
    {
        int index = 0;
        double [] surfaceGravAct = new double [8];
        
        File fileName = new File("gravity.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNextDouble())
        {
            surfaceGravAct[index] = inFile.nextDouble();
            index++;
        }
        inFile.close();
        return surfaceGravAct;
    }
    
    public static void printHeader()
    {
        System.out.printf("%33s", "My Weights on the Planets");
        System.out.println();
        System.out.printf("%8s %12s %17s", "Planet", "Gravity", "Weight (lbs)");
        System.out.println();
        for (int i = 0; i < 39; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static double calcWeight(double weight, double surfaceGrav)
    {
        return (((weight) * (453.59237)) / surfaceGrav) / 453.59237;
    }
    
    public static void main(String[] args) throws IOException
    {
        double myWeight = 150;
        
        String [] planets = new String[8];
        planets = planets();
        
        double [] surfaceGravAct = new double[8];
        surfaceGravAct = surfaceGravAct();
        
        double [] surfaceGrav = new double [8];
        surfaceGrav = surfaceGrav();
        printHeader();
        for (int i = 0; i < 8; i++)
        {
            System.out.printf("%2s", "");
            System.out.printf("%-7s", planets[i]);
            System.out.printf("%10.2f", surfaceGravAct[i]);
            System.out.printf("%14.2f", calcWeight(myWeight, surfaceGrav[i]));
            System.out.println();
        }
    }
}
