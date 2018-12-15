
/**
 * Write a description of class AnnualClimate1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.IOException;

public class AnnualClimate1
{
    public static void main(String[] args) throws Exception
    {
        double [] precipAin = {2.2, 1.5, 1.9, 2.1, 3.5, 4.6, 3.3, 5.4, 5.5, 4.3, 2.6, 2.1, 69.0};
        double [] tempAf = {70.3, 70.8, 73.8, 77.0, 80.7, 83.4, 84.5, 84.4, 83.4, 76.3, 72.0, 69.0};
        String [] monthA = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.", "rober"}; 
        
        Scanner in = new Scanner(System.in);
        
        String answer;
        double sumTemp = 0;
        double avg;
        double annual = 0;
        
        System.out.println("View weather data in imperial (I) or metric (M): ");
        answer = in.next();
        
        System.out.println("\t\t\tClimate Data");
        System.out.println("\t\tLocation: Key West, FL");
        
        if (answer.equalsIgnoreCase("I"))
        {
            System.out.printf("%5s%20s%26s\n", "Month", "Temperature (F)", "Percipitation (in.)");
            System.out.println("************************************************************");
            for (int i = 0; i < 12; i++)
            {
                System.out.printf("%4s%15s%25s\n", monthA[i], tempAf[i], precipAin[i]);
                sumTemp += tempAf[i];
                annual += precipAin[i];
            }
            avg = sumTemp / 12;
            System.out.println("************************************************************");
            System.out.printf("%15s%4.1f%22s%4.1", "Average: ",avg, "Annual: ");
        }
        if (answer.equalsIgnoreCase("M"))
        {
            System.out.println("Month\tTemperature (C)\t\tPrecipitation (cm.)");
            System.out.println("************************************************************");
            for (int i = 0; i < 12; i++)
            {
                System.out.printf("%8s%13s%20s\n", monthA[i], ((tempAf[i] - 32) * (5/9)), (precipAin[i]*2.54));
                sumTemp += tempAf[i];
                annual += precipAin[i];
            }
            avg = sumTemp / 12;
            System.out.println("************************************************************");
            System.out.printf("Average: %5.2f", avg);
        }
    }
}
