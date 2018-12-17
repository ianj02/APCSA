
/**
 * Write a description of class CarV3 here.
 *
 * @author Ian Jackson
 * @version 12/12/18
 */
public class CarV3
{
    private String carType;
    private double costOfTrip;
    private double milesPerGallon;
    private double gallonsPerMile;
    private double gallonsUsed;
    private double pricePerGallon;
    private int endMiles;
    private int startMiles;
    
    CarV3() {}
    
    public CarV3 (String car, int endMile, int startMile, double galUsed, double pricePerGal, double costOfGal, double milesPerGal, double galsPerMile)
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
        System.out.printf("%51s", "Gas Mileage Calculations");
        System.out.println();
        System.out.printf("%13s", "Type of Car");
        System.out.printf("%16s", "Start Miles");
        System.out.printf("%13s", "End Miles");
        System.out.printf("%12s", "Distance");
        System.out.printf("%11s", "Gallons");
        System.out.printf("%13s", "Miles/Gal");
        System.out.println();
        for (int i = 0; i < 80; i++)
        {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public static void main (String [] args)
    {
        double gals;
        int sMile;
        int eMile;
        int distance;
        double mpg;
        String car;
        double priceGas;
        double costGas;
        
        gals = 17.67;
        sMile = 103650;
        eMile = 103915;
        priceGas = 2.45;
        
        car = "09 Toyota Frontier";
        
        CarV3 car1 = new CarV3(car, eMile, sMile, gals, priceGas, gals * priceGas, ((eMile - sMile)/gals), gals/priceGas);
        
        costGas = car1.calcCost();
        
        distance = car1.calcDistance();
        
        mpg = car1.calcMPG();
        
        car1.printHeader();
        for (int i = 0; i < 1; i++)
        {
            System.out.printf("%-20s", car1.carType);
            System.out.printf("%8d", car1.startMiles);
            System.out.printf("%13d", car1.endMiles);
            System.out.printf("%12d", car1.calcDistance());
            System.out.printf("%11.1f", car1.gallonsUsed);
            System.out.printf("%12.1f", car1.calcMPG());
        }
        
    }
}
