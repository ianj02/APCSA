
/**
 * Write a description of class BMR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BMR
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
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
        
        //convert lbs to k
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
}
