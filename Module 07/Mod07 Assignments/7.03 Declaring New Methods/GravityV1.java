
/**
 * Write a description of class GravityV1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class GravityV1
{
    public static String [] planetName()
    {
        String [] planetName = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        return planetName;
    }
    
    public static double [] planetMass()
    {
        double [] planetMassDec = {0.33, 4.87, 5.98, 0.642, 1898, 568, 86.8, 102.1};
        double [] planetMass = new double[8];
        for (int i = 0; i < 8; i++)
        {
            planetMass[i] = planetMassDec[i] * Math.pow(10, 24);
        }
        return planetMass;
    }
    
    public static double [] planetRadius()
    {
        double [] planetDiameterKm = {4879, 12104, 12756, 6792, 142984, 120536, 51118, 49528};
        double [] planetRadius = new double [8];
        for (int i = 0; i < 8; i++)
        {
            planetRadius[i] = (planetDiameterKm[i] * Math.pow(10, 3)) / 2;
        }
        return planetRadius;
    }
    
    public static double [] planetDiameter()
    {
        double [] planetDiameterKm = {4879, 12104, 12756, 6792, 142984, 120536, 51118, 49528};
        return planetDiameterKm;
    }
    
    public static double gravConstant()
    {
        return 6.67 * Math.pow(10, -11);
    }
    
    public static double calcSurfaceGrav(double mass, double radius)
    {
        return (gravConstant() * mass) / Math.pow(radius, 2);
    }
    
    public static void printHeader()
    {
        System.out.printf("%41s", "Planetary Data");
        System.out.println();
        System.out.printf("%8s %20s %18s %15s", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println();
        for (int i = 0; i < 66; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void main (String [] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter (new File("gravity.txt"));
        
        String[] planets = new String[8];
        planets = planetName();
        
        double [] planetMass = new double [8];
        planetMass = planetMass();
        
        double [] planetRadius = new double [8];
        planetRadius = planetRadius();
        
        double [] planetDiameter = new double [8];
        planetDiameter = planetDiameter();
        
        printHeader();
        
        for (int i = 0; i < 8; i++)
        {
            System.out.printf("%1s %-7s", "", planets[i]);
            System.out.printf("%18.0f", planetDiameter[i]);
            System.out.printf("%20s", planetMass[i]);
            System.out.printf("%14.2f", calcSurfaceGrav(planetMass[i], planetRadius[i]));
            System.out.println();
        }
        
        for (int i = 0; i < 8; i++)
        {
            outFile.printf("%-4.2f", calcSurfaceGrav(planetMass[i], planetRadius[i]));
            outFile.println();
        }
        outFile.close();
    }
}
