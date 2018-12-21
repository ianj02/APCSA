
/**
 * Write a description of class AnnualFuel here.
 *
 * @author Ian Jackson
 * @version 12/20/18
 */
public class AnnualFuelUse
{
    //declare variables
    private double gallonsUsed, pricePerGallon, MPG, GPM, cost;
    private int fillUpNum, day, endMiles, startMiles, distance;

    //create contructor
    public AnnualFuelUse (int fillUpNumI, int dayI, int startMile, int endMile, double galUsed, double pricePerGal)
    {
        fillUpNum = fillUpNumI;
        day = dayI;
        endMiles = endMile;
        startMiles = startMile;
        gallonsUsed = galUsed;
        pricePerGallon = pricePerGal;
        
        distance = 0;
        MPG = 0;
        GPM = 0;
        cost = 0;
    }

    /*
     * Mutator Methods to calculate Distance, MPG, GMP, and Cost
     */
    
    //mutator method to calculate distance traveled
    public void calcDistance()
    {
        distance = endMiles - startMiles;
    }

    //mutator method to calculate MPG
    public void calcMPG()
    {
        MPG = ((double)distance) / gallonsUsed;
    }

    //mutator method to calculate GPM
    public void calcGPM()
    {
        GPM = gallonsUsed / distance;
    }
    
    //mutator method to calculate cost of trip
    public void calcCost()
    {
        cost = (gallonsUsed * pricePerGallon);
    }
    
    /*
     * Getter Methods to get calculated variables
     */
    
    //getter method for fill up day
    public int getFillUpNum()
    {
        return fillUpNum;
    }
    
    public int getDay()
    {
        return day;
    }
    
    //getter method for start mile
    public int getStartMile()
    {
        return startMiles;
    }
    
    //getter method for end mile
    public int getEndMile()
    {
        return endMiles;
    }
    
    //getter method for gallons used
    public double getGalUsed()
    {
        return gallonsUsed;
    }
    
    //getter method for distance
    public double getDistance()
    {
        return distance;
    }
    
    //getter method for MPG
    public double getMPG()
    {
        return MPG;
    }
    
    //getter method for GPM
    public double getGPM()
    {
        return GPM;
    }
    
    //getter method for price
    public double getPrice()
    {
        return pricePerGallon;
    }
    
    //getter method for cost
    public double getCost()
    {
        return cost;
    }
    
    /*
     * Methods to print header and results
     */
    
    //method to print header
    public void printHeader()
    {
        System.out.printf("%7s %6s %13s %11s %10s %14s %6s %7s %7s",
                          "Fill Up", "Days", "Start Miles",
                          "End Miles", "Distance", "Gallons Used", "MPG",
                          "Price", "Cost");
    }
}
