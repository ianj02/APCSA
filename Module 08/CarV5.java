
/**
 * Write a description of class CarV5 here.
 *
 * @author Ian Jackson
 * @version 12/17/18
 */
public class CarV5
{
    private String carType;
    private double costOfTrip;
    private double milesPerGallon;
    private double gallonsPerMile;
    private double gallonsUsed;
    private double pricePerGallon;
    private int endMiles;
    private int startMiles;
    
    CarV5() {}
    
    public CarV5 (String car, int endMile, int startMile, double galUsed, double pricePerGal, double costOfGal, double milesPerGal, double galsPerMile)
    {
        pricePerGallon = pricePerGal;
        costOfTrip = costOfGal;
        milesPerGallon = milesPerGal;
        gallonsPerMile = galsPerMile;
        carType = car;
        endMiles = endMile;
        startMiles = startMile;
        gallonsUsed = galUsed;
    }
    
    public int calcDistance() {
        return endMiles - startMiles;
    }

    public double calcMPG() {
        return ((double)calcDistance()) / gallonsUsed;
    }

    public double calcGPM() {
        return gallonsUsed / calcDistance();
    }

    public double calcCost() {
        double cost = (gallonsUsed * pricePerGallon);
        return cost;
    }
    
    public void printHeader()
    {
        System.out.printf("%54s", "Gas Mileage Calculations");
        System.out.println();
        System.out.printf("%15s", "Type of Car");
        System.out.printf("%14s", "Start Miles");
        System.out.printf("%11s", "End Miles");
        System.out.printf("%10s", "Distance");
        System.out.printf("%10s", "Gallons");
        System.out.printf("%8s", "Price");
        System.out.printf("%8s", "Cost");
        System.out.printf("%12s", "Miles/Gal");
        System.out.printf("%11s", "Gal/Mile");
        System.out.println();
        for (int i = 0; i < 99; i++)
        {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public static void main (String [] args)
    {
        double gals1;
        int sMile1;
        int eMile1;
        int distance1;
        String carType1;
        double priceGas1;
        
        gals1 = 17.67;
        sMile1 = 103650;
        eMile1 = 103915;
        priceGas1 = 2.45;
        
        carType1 = "09 Nissan Frontier";
        
        CarV5 Car1 = new CarV5(carType1, eMile1, sMile1, gals1, priceGas1, gals1 * priceGas1, ((eMile1 - sMile1)/gals1), gals1/priceGas1);
        
        Car1.printHeader();
        
        for (int i = 0; i < 1; i++)
        {
            System.out.printf("%-13s", Car1.carType);
            System.out.printf("%9d", Car1.startMiles);
            System.out.printf("%11d", Car1.endMiles);
            System.out.printf("%11d", Car1.calcDistance());
            System.out.printf("%10.1f", Car1.gallonsUsed);
            System.out.printf("%9.2f", Car1.pricePerGallon);
            System.out.printf("%8.2f", Car1.calcCost());
            System.out.printf("%10.1f", Car1.calcMPG());
            System.out.printf("%12.3f", Car1.calcGPM());
            
        }
        
        
    }
}
