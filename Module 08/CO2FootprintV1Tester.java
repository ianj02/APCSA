
/**
 * This class test the CO2FootprintV1 class.
 *
 * @author Ian Jackson
 * @version 12/23/18
 */
public class CO2FootprintV1Tester
{
    public static void main(String [] args)
    {
        //initialization of array of objects
        CO2FootprintV1[] CO2Foot = {new CO2FootprintV1(885.39)};
        
        //call methods
        for (int i = 0; i < CO2Foot.length; i++)
        {
            CO2Foot[i].calcTonsCO2();
            CO2Foot[i].convertTonsToPoundsCO2();
        }
        
        //print results
        System.out.printf("%24s", "CO2 Emissions");
        System.out.println();
        System.out.printf("%-10s %-12s %-4s", "Gallons", "Pounds", "Tons");
        System.out.println();
        System.out.printf("%-9s %-11s %-8s", "of Gas", "from Gas", "from Gas");
        System.out.println();
        for (int i = 0; i < 30; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 0; i < CO2Foot.length; i++)
        {
            System.out.printf("%5.1f %11.2f %10.2f",
                               CO2Foot[i].getGallons(),
                               CO2Foot[i].getPoundsCO2(),
                               CO2Foot[i].getTonsCO2());
            System.out.println();
        }
    }
}
