
/**
 * Write a description of class HeadsOrTailsV1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args)
    {
        int males = 0;
        int females = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner in = new Scanner(System.in);
        
        //System.out.println("What is the population? ");
        //int pop = in.nextInt();
        int pop = 10000;
     
        while(counter <= pop)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
            
            if(randNum < .86)
            {
                males++;
                System.out.println("\t M");
            }
            else
            {
                females++;
                System.out.println("\t F");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("Number of males = " + males);
        System.out.println("Number of females = " + females);
    }
}
