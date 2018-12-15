/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  
 * @version 
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.println("Enter your selection: ");
        String selection = in.next();
        System.out.println();
        
        if(selection.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            System.out.print("Enter your name (first last): ");
            String firstName = in.next();
            String lastName = in.next();
        
            System.out.print("\nEnter your weight in pounds (e.g. 175): " );
            String weightS = in.next();
            double weightLbs = Double.parseDouble(weightS);
        
            System.out.print("\nEnter your height in feet and inches (e.g. 5 11): ");
            String feetS = in.next();
            String inchesS = in.next();
            double feet = Double.parseDouble(feetS);
            double inches = Double.parseDouble(inchesS);
            double heightIn = (feet * 12) + inches;
        
            //convert in to cm
            double heightCm;
            double inToCm = 2.54;
            heightCm = heightIn * inToCm;
            double heightM = heightCm / 100;
        
            //convert lbs to kg
            double weightKg;
            double lbsToKg = 0.453592;
            weightKg = weightLbs * lbsToKg;
        
            double bmi = weightKg / (heightM * heightM);
        
            String category = "Error: No class";
        
            if(bmi >= 30)
            {
                category = "Obese";
            }
            if(bmi >= 25 && bmi <= 30)
            {
                category = "Over Weight";
            }
            if(bmi >= 18.5 && bmi <= 25)
            {
                category = "Healthy Weight";
            }
            if (bmi < 18.5)
            {
                category = "Under Weight";
            }    
        
            System.out.println("\nBody Mass Index Calculator");
            System.out.println("===========================");
            System.out.print("Name: " + firstName + " " + lastName + "\n");
            System.out.print("Height (m): " + heightM + "\n");
            System.out.print("Weight (kg): " + weightKg + "\n");
            System.out.print("BMI: " + bmi + "\n");
            System.out.print("Category: " + category);
        }
        else if(selection.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
            String name;
            char genderChar;
            int age;
            double heightIn;
            double weightLbs;
        
            System.out.print("Enter your name: ");
            name = in.next();
        
            System.out.print("\nGender (M or F): ");
            String genderS = in.next();
            genderChar = genderS.charAt(0);
        
            System.out.print("\nEnter your age: ");
            String ageS = in.next();
            age = Integer.parseInt(ageS);
        
            System.out.print("\nHeight in inches: ");
            String heightInS = in.next();
            heightIn = Double.parseDouble(heightInS);
        
            System.out.print("\nWeight in pounds: ");
            String weightLbsS = in.next();
            weightLbs = Double.parseDouble(weightLbsS);
        
            // convert in to cm
            double heightCm;
            double inToCm = 2.54;
            heightCm = heightIn * inToCm;
        
            //convert lbs to kg
            double weightKg;
            double lbsToKg = 0.453592;
            weightKg = weightLbs * lbsToKg;
        
            boolean isMale = genderChar == 'M';
        
            double bmr;
        
            if (isMale = true)
            {
                bmr = (((13.7516 * weightKg) / 1) + ((5.0033 * heightCm) / 1) - ((6.7550 * age) / 1) + 66.4730);
            }
            else
            {
                bmr = (((9.5634 * weightKg) / 1) + ((1.8496 * heightCm) / 1) - ((4.6756 * age) / 1) + 655.0955);
            }
        
            System.out.print("\n\nCalculate your Basal Metabolism\n");
            System.out.print("\nName: " + name);
            System.out.print("\nGender: " + genderChar);
            System.out.print("\nAge: " + age);
            System.out.print("\nWeight (kg): " + weightKg);
            System.out.print("\nHeight (cm): " + heightCm);
            System.out.print("\nBasal Metablolic Rate: " + bmr + " calaries per day");
        }
        else if (selection.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("You've chose Healthy Eating");
        }
        else if (selection.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("You've chose Food Pyramid");
        }
        else if (selection.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("You've chose Fitness Training");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
            System.out.println("Invalid menu character");
        }
    }
}
