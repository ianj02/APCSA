
/**
 * Write a description of class BottleCapPrize here.
 *
 * @author Ian Jackson
 * @version 11/26/2018
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter (new File("results.txt"));
        int sides = 5;
        int numOfRolls = 0;
        int numOfTrials = 0;
        int die = 0;
        int counter = 1;
        int totalCount = 0;
        
        System.out.println("Enter number of trails (Above 1000): ");
        int trials = in.nextInt();
        trials --;
        for(numOfTrials = 0; numOfTrials <= trials; numOfTrials++)
        {
            die = 0;
            counter = 1;
            while (die != 1)
            {
                die = random.nextInt(sides);
                if(die == 1)
                {
                    outFile.println(counter);
                }
                else
                {
                    counter++;
                }
            }
            totalCount += counter;
        }
        outFile.close();
        trials ++;
        
        int token;
        Scanner inFile = new Scanner(new File("results.txt"));
        while (inFile.hasNextInt())
        {
            token = inFile.nextInt();
        }
        
        double avg = totalCount / trials;
        System.out.println();
        System.out.println("Average number of caps opened in order to win a prize:" + avg);
    }
}
