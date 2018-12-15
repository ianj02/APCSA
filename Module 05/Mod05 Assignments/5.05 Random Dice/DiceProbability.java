
/**
 * Write a description of class DiceProbability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class DiceProbability
{
    public static void main(String [] main)
    {
        Random random;
        random = new Random();
        
        Scanner in = new Scanner(System.in);
        
        int die1;
        int die2;
        int sides;
        int diceRolls;
        int sum;
        int sumOfDie;
        double numOfRolls;
        double allMatches = 0;
        double probability;
        
        System.out.println("Enter the amount of sides on the dice");
        sides = in.nextInt();
        
        System.out.println("Enter amount of time you want to roll the dice");
        diceRolls = in.nextInt();
        
        System.out.println("Sum of dice\tProbabiltiy\n");
        
        for(sum = 2; sum <= 2 * sides; sum++)
        {
            for(numOfRolls = 0; numOfRolls <= diceRolls; numOfRolls++)
            {
                die1 = random.nextInt(sides) + 1;
                die2 = random.nextInt(sides) + 1;
                
                sumOfDie = die1 + die2;
                
                if(sumOfDie == sum)
                {
                    allMatches += 1;
                }
            }
            probability = (allMatches / numOfRolls) * 100;
            System.out.println(sum +"s:"+ "\t\t" + probability);
            allMatches = 0;
        }
    }
}
