
/**
 * Write a description of class Family here.
 *
 * @author Ian Jackson
 * @version 11/9/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        double boys = 0;
        double girls = 0;
        double mixed = 0;
        double counter = 0;
        
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        while (inFile.hasNextLine())
        {
            token = inFile.next();
            if (token.equals("BB"))
            {
                boys ++;
                counter ++;
            }
            if (token.equals("GG"))
            {
                girls ++;
                counter ++;
            }
            if (token.equals("BG") || token.equals("GB"))
            {
                mixed ++;
                counter ++;
            }
        }
        inFile.close();
        double perBoys = (boys / counter) * 100;
        double perMix = (mixed / counter) * 100;
        double perGirls = (girls / counter) * 100;
        System.out.println("Sample Size: " + (int)counter);
        System.out.println("Two Boys: " + perBoys + "%");
        System.out.println("One Boy One Girl: " + perMix + "%");
        System.out.println("Two Girls: " + perGirls + "%");
    }
}