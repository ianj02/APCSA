
/**
 * @author Ian Jackson
 * @version 12/27/18
 */
public class CO2Footprint
{
    //user input private instance variables
    private int numBulbs, numPeople;
    private double annGas, avgElectBill, avgElectPrice;
    private boolean paper, plastic, glass, cans;
    
    //calculated private instance variables
    private double lbsCO2Gas, lbsCO2Elect, lbsCO2Waste, lbsCO2Gross, lbsCO2Recycle, lbsCO2Bulbs, lbsCO2Net;
    
    /**
     * Defualt Constructor for objects of the CO2Footprint class
     * @param annualGas the annual gas used
     * @param averageElectBill the average electricity bill
     * @param averageElectPrice the average electricity price
     * @param numberResidence the number of residence in a household
     * @param recyclePaper if the user recycles paper
     * @param recyclePlastic if the user recycles plastic
     * @param recycleGlass if the user recycles glass
     * @param recycleCans if the user recycles cans
     * @param numberBulbsReplaced the number of bulbs replaced by user
     */
    CO2Footprint(double annualGas, double averageElectBill, double averageElectPrice, int numberResidence, boolean recyclePaper, boolean recyclePlastic,
                 boolean recycleGlass, boolean recycleCans, int numberBulbsReplaced)
    {
        annGas = annualGas;
        avgElectBill = averageElectBill;
        avgElectPrice = averageElectPrice;
        numPeople = numberResidence;
        paper = recyclePaper;
        plastic = recyclePlastic;
        glass = recycleGlass;
        cans = recycleCans;
        numBulbs = numberBulbsReplaced;
        
        lbsCO2Gas = 0;
        lbsCO2Elect = 0;
        lbsCO2Waste = 0;
        lbsCO2Gross = 0;
        lbsCO2Recycle = 0;
        lbsCO2Bulbs = 0;
        lbsCO2Net = 0;
    }
    
    /*
     * Mutator Methods
     */
    
    /**
     * Mutator Method to calculate CO2 footprint from gas
     * @param lbsCO2Gas the amount of CO2 released from gas usage
     */
    public void calcCO2FromGas()
    {
        double metricTons;
        metricTons = ((8.78 * Math.pow(10, -3)) * annGas);
        lbsCO2Gas = (metricTons * 2204.62262);
    }
    
    /**
     * Mutator Method to calculate CO2 footprint from electricity
     * @param lbsCO2Elect the amount of CO2 released from electricity usage
     */
    public void calcCO2FromElect()
    {
        lbsCO2Elect = (avgElectBill / avgElectPrice) * 1.37 * 12;
    }
    
    /**
     * Mutator Method to calculate the CO2 footprint from a household
     * @param lbsCO2Waste the amount of CO2 released from a household
     */
    public void calcCO2FromWaste()
    {
        lbsCO2Waste = numPeople * 1018;
    }
    
    /**
     * Mutator Method to calculate the Gross CO2 Produced
     * @param lbsCO2Gross the gross amount of CO2 produced
     */
    public void calcCO2Gross()
    {
        lbsCO2Gross = lbsCO2Gas + lbsCO2Elect + lbsCO2Waste;
    }
    
    /**
     * Mutator Method to calculate the amount of CO2 reduced by recycling
     * @param lbsCO2Recycle the amount of CO2 reduced by recycing
     */
    public void calcCO2FromRecycle()
    {
        if (paper == true)
        {
            lbsCO2Recycle += 184.0;
        }
        if (plastic == true)
        {
            lbsCO2Recycle += 25.6;
        }
        if (glass == true)
        {
            lbsCO2Recycle += 46.6;
        }
        if (cans == true)
        {
            lbsCO2Recycle += 165.8;
        }
    }
    
    /**
     * Mutator Method to calculate the amount of CO2 reduced by replacing bulbs
     * @param lbsCO2Bulbs the amount of CO2 reduced by replacing bulbs
     */
    public void calcCO2FromBulb()
    {
        lbsCO2Bulbs = numBulbs * 1.37 * 73;
    }
    
    /**
     * Mutator Method to calculate the CO2 Footprint
     * @param lbsCO2Net CO2 footprint
     */
    public void calcCO2Net()
    {
        lbsCO2Net = lbsCO2Gross - (lbsCO2Recycle + lbsCO2Bulbs);
    }
    
    /*
     * Getter Methods
     */
    
    /**
     * Getter Method to get the pounds of CO2 produced by Gas
     * @return The amount of CO2 produced by gas
     */
    public double getlbsCO2Gas()
    {
        return lbsCO2Gas;
    }
    
    /**
     * Getter Method to get the pounds of CO2 produced by Electricity
     * @return The amount of CO2 produced by electricity
     */
    public double getlbsCO2Elect()
    {
        return lbsCO2Elect;
    }
    
    /**
     * Getter Method to get the pounds of CO2 produced by Waste
     * @return The amount of CO2 produced by Waste
     */
    public double getlbsCO2Waste()
    {
        return lbsCO2Waste;
    }
    
    /**
     * Getter Method to get the pounds of CO2 reduced by recycling
     * @return The amount of CO2 reduced by Recycling
     */
    public double getlbsCO2Recycle()
    {
        return lbsCO2Recycle;
    }
    
    /**
     * Getter Method to get the pounds of CO2 reduced by replacing lightbulbs
     * @return The amount of CO2 reduced by Replacing Lightbulbs
     */
    public double getlbsCO2Bulbs()
    {
        return lbsCO2Bulbs;
    }
    
    /**
     * Getter Method to get the net amount of CO2 produced
     * @return the CO2 footprint
     */
    public double getlbsCO2Net()
    {
        return lbsCO2Net;
    }
    
    /**
     * Getter Method to get the header
     * @return The header of the program
     */
    public void printHeader()
    {
        System.out.printf("%1s %28s %13s %19s %9s %18s", "|", "Pounds of CO2", "|", "Pounds of CO2", "|", "|");
        System.out.println();
        System.out.printf("%1s %28s %13s %18s %10s %18s", "|", "Emmitted from", "|", "Reduced from", "|", "|");
        System.out.println();
        System.out.printf("%1s %6s %5s %14s %2s %7s %3s %11s %2s %11s %2s %15s %2s", "|", "Gas", "|", "Electricity", "|", "Waste", "|", "Recycling", "|",
                          "New Bulbs", "|", "CO2 Footprint", "|");
        System.out.println();
        System.out.printf("%1s%11s%1s%16s%1s%10s%1s%13s%1s%13s%1s%17s%1s", "|", "============", "|", "=================", "|", "===========", "|",
                          "==============", "|", "==============", "|", "==================", "|");
        System.out.println();
    }
}
