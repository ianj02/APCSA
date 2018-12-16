
/**
 * Write a description of class GuessingGameV1 here.
 *
 * @author Ian Jackson
 * @version 11/6/2018
 */
import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        double ranD = Math.random();
        ranD *= 100;
        int randomNum = (int)ranD;
        
        boolean guessCorrect = false;
        
        int counter = 1;
        
        while (guessCorrect == false)
        {
            System.out.println("Enter your guess: ");
            int guess = in.nextInt();
            
            if (guess == randomNum)
            {
                guessCorrect = true;
                System.out.println("Congratulations");
                System.out.println("The random number was: " + randomNum);
                System.out.println("Number of guesses: " + counter);
            }
            else if (guess > randomNum)
            {
                guessCorrect = false;
                System.out.println("Too high");
                counter ++;
            }
            else if (guess < randomNum)
            {
                guessCorrect = false;
                System.out.println("Too low");
                counter ++;
            }
        }
    }
}
