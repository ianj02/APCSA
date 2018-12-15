
/**
 * Write a description of class Hurricanes2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Hurricanes2
{
    public static void main (String [] args) throws IOException
    {
        Scanner inFile = new Scanner (new File("hurcdata2.txt"));

        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        
        String [] monthA = new String[59];
        String [] nameA  = new String[59];
        int [] yearA       = new int[59];
        int [] pressureMbA = new int[59];
        int [] windSpeedKnA = new int[59];
        double [] windSpeedMph = new double[59];
        int [] categoryA   = new int[59];

        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        
        int sumCatAvg = 0;
        double avgCat = 0;
        
        int sumPresAvg = 0;
        double avgPres = 0;
        
        int sumWindAvg = 0;
        double avgWind = 0;
        
        Integer catMin = Integer.MIN_VALUE;
        Integer catMax = Integer.MAX_VALUE;
        
        Integer presMin = Integer.MIN_VALUE;
        Integer presMax = Integer.MAX_VALUE;
        
        double windMin = Integer.MIN_VALUE;
        double windMax = Integer.MAX_VALUE;

        for (int i = 0; i < 59; i++)
        {
            yearA[i] = inFile.nextInt();
            monthA[i] = inFile.next();
            pressureMbA[i] = inFile.nextInt();
            windSpeedKnA[i] = inFile.nextInt();
            nameA[i] = inFile.next();
            windSpeedMph[i] = windSpeedKnA[i] * 1.15077945;
            if (windSpeedMph[i] < 95.0)
            {
                categoryA[i] = 1;
                cat1 ++;
            }
            else if (windSpeedMph[i] <= 110)
            {
                categoryA[i] = 2;
                cat2 ++;
            }
            else if (windSpeedMph[i] <= 129)
            {
                categoryA[i] = 3;
                cat3 ++;
            }
            else if (windSpeedMph[i] <= 156)
            {
                categoryA[i] = 4;
                cat4 ++;
            }
            else
            {
                categoryA[i] = 5;
                cat5 ++;
            }
            
            sumPresAvg += pressureMbA[i];
            sumWindAvg += windSpeedMph[i];
            
            if (categoryA[i] > catMin)
            {
                catMin = categoryA[i];
            }
            if (categoryA[i] < catMax)
            {
                catMax = categoryA[i];
            }
            
            if (pressureMbA[i] > presMin)
            {
                presMin = pressureMbA[i];
            }
            if (pressureMbA[i] < presMax)
            {
                presMax = pressureMbA[i];
            }
            
            if (windSpeedMph[i] > windMin)
            {
                windMin = windSpeedMph[i];
            }
            if (windSpeedMph[i] < windMax)
            {
                windMax = windSpeedMph[i];
            }
        }
        
        sumCatAvg = cat1 + (cat2 * 2) + (cat3 * 3) + (cat4 * 4) + (cat5 * 5);
        avgCat = sumCatAvg / 59;
        
        avgPres = sumPresAvg / 59;
        
        avgWind = sumWindAvg / 59;
        
        System.out.printf("%44s", "Hurricanes 1980 - 2006");
        System.out.println();
        System.out.printf("%-9s", "Year");
        System.out.printf("%-12s", "Hurricane");
        System.out.printf("%-13s", "Category");
        System.out.printf("%-13s", "Pressure (Mb)");
        System.out.printf("%20s", "Wind Speed (mph)");
        System.out.println();
        for (int i = 0; i < 67; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < 59; i++)
        {
            System.out.printf("%-10d", yearA[i]);
            System.out.printf("%-16s", nameA[i]);
            System.out.printf("%1d", categoryA[i]);
            System.out.printf("%15d", pressureMbA[i]);
            System.out.printf("%19.0f\n", windSpeedMph[i]);
        }
        for (int i = 0; i < 67; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-26s", "Average");
        System.out.printf("%1.0f", avgCat);
        System.out.printf("%15.0f", avgPres);
        System.out.printf("%19.0f", avgWind);
        System.out.println();
        
        System.out.printf("%-26s", "Maximum");
        System.out.printf("%1d", catMin);
        System.out.printf("%15d", presMin);
        System.out.printf("%19.0f", windMin);
        System.out.println();
        
        System.out.printf("%-26s", "Minimum");
        System.out.printf("%1d", catMax);
        System.out.printf("%15d", presMax);
        System.out.printf("%19.0f", windMax);
        System.out.println();
        
        System.out.println();
        System.out.printf("%-21s", "Number of Category 1:");
        System.out.printf("%3d\n", cat1);
        System.out.printf("%-21s", "Number of Category 2:");
        System.out.printf("%3d\n", cat2);
        System.out.printf("%-21s", "Number of Category 3:");
        System.out.printf("%3d\n", cat3);
        System.out.printf("%-21s", "Number of Category 4:");
        System.out.printf("%3d\n", cat4);
        System.out.printf("%-21s", "Number of Category 5:");
        System.out.printf("%3d\n", cat5);
        
        //Print to file
        outFile.printf("%-26s", "Average");
        outFile.printf("%1.0f", avgCat);
        outFile.printf("%15.0f", avgPres);
        outFile.printf("%19.0f", avgWind);
        outFile.println();
        
        outFile.printf("%-26s", "Maximum");
        outFile.printf("%1d", catMin);
        outFile.printf("%15d", presMin);
        outFile.printf("%19.0f", windMin);
        outFile.println();
        
        outFile.printf("%-26s", "Minimum");
        outFile.printf("%1d", catMax);
        outFile.printf("%15d", presMax);
        outFile.printf("%19.0f", windMax);
        outFile.println();
        
        outFile.println();
        outFile.printf("%-21s", "Number of Category 1:");
        outFile.printf("%3d\n", cat1);
        outFile.println();
        outFile.printf("%-21s", "Number of Category 2:");
        outFile.printf("%3d\n", cat2);
        outFile.println();
        outFile.printf("%-21s", "Number of Category 3:");
        outFile.printf("%3d\n", cat3);
        outFile.println();
        outFile.printf("%-21s", "Number of Category 4:");
        outFile.printf("%3d\n", cat4);
        outFile.println();
        outFile.printf("%-21s", "Number of Category 5:");
        outFile.printf("%3d\n", cat5);
        outFile.println();
        
        outFile.close();
    }
}
