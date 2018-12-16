
/**
 * Write a description of class BMI here.
 *
 * @author Ian Jackon
 * @version 10/21/2018
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String [] args)
    {
        Scanner in;
        in = new Scanner(System.in);
        
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
        
       String category = "No class";
        
       if(bmi >= 30)
       {
            category = "Obese";
       }
       if(bmi >= 25 && bmi < 29.9)
       {
            category = "Over Weight";
       }
       if(bmi >= 18.5 && bmi < 24.9)
       {
            category = "Healthy Weight";
       }
       if(bmi < 18.5)
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
}
