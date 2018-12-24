
/**
 * This class instantiates CO2 Footprint objects with 3 private variables.
 * It contains 2 mutator methods to calculate the amount of CO2 emitted in Tons and Pounds
 * There are getter methods for each private instance
 * Private instance variables include myGallonsUsed, myTonsCO2, and myPoundsCO2.
 *
 * @author Ian Jackson
 * @version 12/21/18
 */
public class CO2FootprintV1
{
    private double myGallonsUsed;
    private double myTonsCO2;
    private double myPoundsCO2;
    
    /**
     * Defualt Constructor for objects of the CO2FootprintV1
     * @param gals the amount of gallons used
     */
    CO2FootprintV1 (double gals)
    {
        myGallonsUsed = gals;
        
        myTonsCO2 = 0;
        myPoundsCO2 = 0;
    }
    
    /**
     * Mutator method to calculate metric tons of CO2 produced
     * @param myTonsCO2 the amount of CO2 produced in Metric Tons
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = ((8.78 * Math.pow(10, -3)) * myGallonsUsed);
    }
    
    /**
     * Mutator method to calculate the amound of pounds of CO2 produced
     * @param myPoundsCO2 the amount of pounds of CO2 produced
     */
    public void convertTonsToPoundsCO2()
    {
        myPoundsCO2 = (myTonsCO2 * 2204.62262);
    }
    
    /*
     * Getter method to get the amount of gas used
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }
    
    /**
     * Getter method to get the amount of CO2 produced in Metric Tons
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }
    
    /**
     * Getter method to get the amount of CO2 produced in Pounds
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
