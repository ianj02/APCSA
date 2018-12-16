
/**
 * Write a description of class TDEE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        double tdee = 0;
        double af = 0;
        
        System.out.print("Enter your first name: ");
        String name = in.next();
        
        System.out.print("\nEnter your gender: ");
        String gender = in.next();
        
        System.out.print("\nEnter your BMR: ");
        double bmr = in.nextDouble();
        
        System.out.println();
        
        if (gender.equalsIgnoreCase("M"))
        {
            System.out.println("Select Your Activity Level");
            System.out.println("[0] Resting (Sleeping, Reclining)");
            System.out.println("[1] Sedentary (Minimal Movement)");
            System.out.println("[2] Light (Sitting, Standing)");
            System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
            System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
            System.out.println("[5] Extremely Active, Full-time Athlete, Heavy Manual Labor)");
            System.out.println();
            System.out.print("Enter the letter corresponding to your activity: ");
            int activityLevel = in.nextInt();
            
            if (activityLevel == 0)
            {
                af = 1.0;
                tdee = bmr * af;
            }
            else if (activityLevel == 1)
            {
                af = 1.3;
                tdee = bmr * af;
            }
            else if (activityLevel == 2)
            {
                af = 1.6;
                tdee = bmr * af;
            }
            else if (activityLevel == 3)
            {
                af = 1.7;
                tdee = bmr * af;
            }
            else if (activityLevel == 4)
            {
                af = 2.1;
                tdee = bmr * af;
            }
            else if (activityLevel == 5)
            {
                af = 2.4;
                tdee = bmr * af;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        
        if (gender.equalsIgnoreCase("F"))
        {
            System.out.println("Select Your Activity Level");
            System.out.println("[0] Resting (Sleeping, Reclining)");
            System.out.println("[1] Sedentary (Minimal Movement)");
            System.out.println("[2] Light (Sitting, Standing)");
            System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
            System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
            System.out.println("[5] Extremely Active, Full-time Athlete, Heavy Manual Labor)");
            System.out.println();
            System.out.print("Enter the letter corresponding to your activity: ");
            int activityLevel = in.nextInt();
            
            if (activityLevel == 0)
            {
                af = 1.0;
                tdee = bmr * af;
            }
            else if (activityLevel == 1)
            {
                af = 1.3;
                tdee = bmr * af;
            }
            else if (activityLevel == 2)
            {
                af = 1.5;
                tdee = bmr * af;
            }
            else if (activityLevel == 3)
            {
                af = 1.6;
                tdee = bmr * af;
            }
            else if (activityLevel == 4)
            {
                af = 1.9;
                tdee = bmr * af;
            }
            else if (activityLevel == 5)
            {
                af = 2.2;
                tdee = bmr * af;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        
        System.out.println();
        System.out.print("Name: " + name);
        System.out.println("\t\tGender: " + gender);
        System.out.print("BMR: " + bmr + " calories");
        System.out.println("\tActivity Factor: " + af);
        System.out.println("TDEE: " + tdee);
    }
}
