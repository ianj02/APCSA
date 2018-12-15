
/**
 * Write a description of class TargetZone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args){
        Scanner input;
        input = new Scanner(System.in);
        
        String userInput;
        
        int age;
        int restHeartRate;
        int exerciseHeartRate;
        
        System.out.println("Determine Your  Target Heart Rate Zone For Cardiovascular Exercise (65% - 85%)\n");
        
        System.out.println("Enter your age: ");
        userInput = input.next();
        age = Integer.parseInt(userInput);
        
        System.out.println("Enter your resting heart rate: ");
        userInput = input.next();
        restHeartRate = Integer.parseInt(userInput);
        
        System.out.println("Enter your heart rate after exercising: ");
        userInput = input.next();
        exerciseHeartRate = Integer.parseInt(userInput);
        
        double maxHeartRate = 206.9 - (0.67 * age);
        double heartRateReserve = maxHeartRate - restHeartRate;
        double lowEndHRZ = 0.65 * heartRateReserve;
        double highEndHRZ = 0.85 * heartRateReserve;
        String resultF = "After just exercising, your heart rate is ";
        String resultB = " your target zone.";
        
        System.out.println("\nYour heart rate target zone is between " + (int)lowEndHRZ + " and " + (int)highEndHRZ);
        if (exerciseHeartRate < lowEndHRZ){
            System.out.println(resultF + "BELOW" + resultB);
        }
        
        if (exerciseHeartRate > lowEndHRZ && exerciseHeartRate < highEndHRZ){
            System.out.println(resultF + "IN" + resultB);
        }
        
        if (exerciseHeartRate > highEndHRZ){
            System.out.println(resultF + "ABOVE" + resultB);
        }
    }
}
