
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
        Scanner fileIn = new Scanner (new File("hurcdata2.txt"));
        
        PrintWriter summaryOut = new PrintWriter (new File("Summary.txt"));
        
        int [] yearA        = new int[59];
        String [] monthA    = new String[59];
        int [] pressureMbA  = new int[59];
        int [] windSpeedKnA = new int[59];
        String [] nameA     = new String[59];
        
        for (int i = 0; i < yearA.length; i++)
        {
            yearA[i] = fileIn.nextInt();
        }
        for (int i = 0; i < yearA.length; i++)
        {
            System.out.println(yearA[i]);
        }
    }
}
