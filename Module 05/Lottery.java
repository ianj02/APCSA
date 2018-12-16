/**
 * Description for 5.04 Lottery project
 * 
 * @author (Your Name)
 * @version (The Date)
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String lotteryNum = "";
        String userGuess = "";
        
        for(int i = 0; i < 3; i++)
        {
            int ranNum = (int)(Math.random() * 10);
            lotteryNum += Integer.toString(ranNum);
        }
        
        System.out.print("Please enter your three numbers (e.g 123): ");
	userGuess = input.nextLine();
	
	if (userGuess.equals(lotteryNum)) 
	{
	    System.out.print("Congrats! Both pairs matched.");
        }
	else if (userGuess.substring(0, 2).equals(lotteryNum.substring(0, 2))) 
	{
	    System.out.print("Congrats! Front pairs matched. The winning number is: " + lotteryNum);
        }
	else if (userGuess.substring(1, 3).equals(lotteryNum.substring(1, 3))) 
	{
	    System.out.print("Congrats! End pairs matched. The winning number is: " + lotteryNum);
	}
	else 
	{
	    System.out.print("Sorry no match. The winning number is: " + lotteryNum);
	}
    } //end main
}//end class Lottery