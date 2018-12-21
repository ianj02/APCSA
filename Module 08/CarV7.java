
/**
 * Write a description of class CarV7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarV7
{
    public String carType;
    public double gallonsUsed;
    public double pricePerGallon;
    public int endMiles;
    public int startMiles;

    CarV7() {}

    public CarV7 (String car, int endMile, int startMile, double galUsed, double pricePerGal)
    {
        carType = car;
        endMiles = endMile;
        startMiles = startMile;
        gallonsUsed = galUsed;
        pricePerGallon = pricePerGal;
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

    public void printResults()
    {
        System.out.printf("%-13s", carType);
        System.out.printf("%9d", startMiles);
        System.out.printf("%11d", endMiles);
        System.out.printf("%11d", calcDistance());
        System.out.printf("%10.1f", gallonsUsed);
        System.out.printf("%9.2f", pricePerGallon);
        System.out.printf("%8.2f", calcCost());
        System.out.printf("%10.1f", calcMPG());
        System.out.printf("%12.3f", calcGPM());
        System.out.println();
    }
}
