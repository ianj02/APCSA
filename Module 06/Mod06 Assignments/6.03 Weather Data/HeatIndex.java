
/**
 * Write a description of class HeatIndex here.
 *
 * @author Ian Jackson
 * @version 12/5/18
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Math;

public class HeatIndex
{
    public static void main (String [] args) throws IOException
    {
        Scanner inFileHumid = new Scanner(new File("KeyWestHumid.txt"));
        Scanner inFileTemp  = new Scanner(new File("KeyWestTemp.txt"));
        
        PrintWriter outFileHi = new PrintWriter (new File("KeyWestHI.txt"));
        
        String [] monthA = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] humidA = new double[12];
        double [] tempA  = new double[12];
        double [] hiA    = new double[12];
        
        double sumTemp  = 0;
        double avgTemp;
        double sumHumid = 0;
        double avgHumid;
        double sumHi    = 0;
        double avgHi;
        
        for (int i = 0; i < 12; i++)
        {
            humidA[i] = inFileHumid.nextDouble();
        }
        for (int i = 0; i < 12; i++)
        {
            tempA[i] = inFileTemp.nextDouble();
        }
        
        System.out.printf("%50s\n", "Heat Index: Key West, Florida");
        System.out.println();
        System.out.printf("%12s", "");
        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%6s", monthA[i]);  
        }
        System.out.printf("%5s", "Avg");
        System.out.println();
        for (int i = 0; i < 90; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.printf("%-14s", "Temp (F)");
        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%-6.1f", tempA[i]);
            sumTemp += tempA[i];
        }
        avgTemp = sumTemp / 12;
        System.out.printf("%4.1f", avgTemp);
        System.out.println();
        
        System.out.printf("%-12s", "Humidity (%)");
        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%6.0f", humidA[i]);
            sumHumid += humidA[i];
        }
        avgHumid = sumHumid / 12;
        System.out.printf("%6.1f", avgHumid);
        System.out.println();
        
        System.out.printf("%-14s", "HI (F)");
        for (int i = 0; i < 12; i++)
        {
            if (tempA[i] < 80)
            {
                hiA[i] = tempA[i];
            }
            else
            {
                hiA[i] = -43.379 + (2.04901523*tempA[i]) + (10.12333127 * humidA[i]) - (0.22475541*tempA[i]*humidA[i]) - (6.83783*(Math.pow(10, -3))*(Math.pow(tempA[i], 2))) - (5.481717*(Math.pow(10, -2))*(Math.pow(humidA[i], 2))) + (1.22874*(Math.pow(10, -3)) * (Math.pow(tempA[i], 2)) * humidA[i]) + (8.5282*(Math.pow(10,-4))*tempA[i]*(Math.pow(humidA[i], 2))) - (1.99*(Math.pow(10, -6))*(Math.pow(tempA[i], 2))*(Math.pow(humidA[i], 2)));         
            }
        }
        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%-6.1f", hiA[i]);
            sumHi += hiA[i];
        }
        avgHi = sumHi / 12;
        System.out.printf("%4.1f", avgHi);
        
        for (int i = 0; i < 12; i++)
        {
            outFileHi.printf("%3.1f\t", hiA[i]);
        }
        outFileHi.close();
    }
}
