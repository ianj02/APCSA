
/**
 * Write a description of class AnnualFuelUseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnnualFuelUseTester
{
    public static void main(String[] args)
    {
        Integer minDist = Integer.MIN_VALUE;
        Integer maxDist = Integer.MAX_VALUE;
        
        double minMPG = Integer.MIN_VALUE;
        double maxMPG = Integer.MAX_VALUE;
        
        double minPrice = Integer.MIN_VALUE;
        double maxPrice = Integer.MAX_VALUE;
        
        Integer maxDays = Integer.MAX_VALUE;
        
        double totalDist = 0,
               totalGalUsed = 0,
               totalCost = 0,
               totalMPG = 0;
        
        double annualDist = 0,
               annualGalUsed = 0,
               annualMPG = 0,
               annualCost = 0;
        
        //initialize array of objects
        AnnualFuelUse[] fillUps = {new AnnualFuelUse(1, 1, 103650, 103915, 17.67, 2.69),
                                   new AnnualFuelUse(2, 8, 103915, 104169, 16.93, 2.62),
                                   new AnnualFuelUse(3, 16, 104169, 104431, 17.47, 2.59),
                                   new AnnualFuelUse(4, 23, 104431, 104676, 16.33, 2.53),
                                   new AnnualFuelUse(5, 32, 104676, 104928, 16.80, 2.50),
                                   new AnnualFuelUse(6, 39, 104928, 105167, 15.93, 2.47)};
        
        //call methods
        for (int i = 0; i < fillUps.length; i++)
        {
            fillUps[i].calcDistance();
            fillUps[i].calcMPG();
            fillUps[i].calcGPM();
            fillUps[i].calcCost();
        }
        
        //find min and max
        for (int i = 0; i < fillUps.length; i++)
        {
            if (fillUps[i].getDistance() > minDist)
            {
                minDist = (int)fillUps[i].getDistance();
            }
            if (fillUps[i].getDistance() < maxDist)
            {
                maxDist = (int)fillUps[i].getDistance();
            }
            
            if (fillUps[i].getMPG() > minMPG)
            {
                minMPG = fillUps[i].getMPG();
            }
            if (fillUps[i].getMPG() < maxMPG)
            {
                maxMPG = fillUps[i].getMPG();
            }
            
            if (fillUps[i].getPrice() > minPrice)
            {
                minPrice = fillUps[i].getPrice();
            }
            if (fillUps[i].getPrice() < maxPrice)
            {
                maxPrice = fillUps[i].getPrice();
            }
            
            if (fillUps[i].getDay() < maxDays)
            {
                maxDays = fillUps[i].getDay();
            }
        }
        
        //find total and annual
        for (int i = 0; i < fillUps.length; i++)
        {
            totalDist += fillUps[i].getDistance();
            totalGalUsed += fillUps[i].getGalUsed();
            totalCost += fillUps[i].getCost();
            totalMPG += fillUps[i].getMPG();
        }
        
        annualDist = (365 - maxDays) * (totalDist / fillUps.length);
        annualGalUsed = (365 - maxDays) * (totalGalUsed / fillUps.length);
        annualMPG = (totalMPG / fillUps.length);
        annualCost = (365 - maxDays) * (totalCost / fillUps.length);
        
        //print results
        fillUps[0].printHeader();
        System.out.println();
        
        for(int i = 0; i < fillUps.length; i++)
        {
            System.out.printf("%4d %8d %11d %12d %10.0f %13.2f %9.2f %7.2f %7.2f",
                               fillUps[i].getFillUpNum(), fillUps[i].getDay(), 
                               fillUps[i].getStartMile(),
                               fillUps[i].getEndMile(), fillUps[i].getDistance(),
                               fillUps[i].getGalUsed(), fillUps[i].getMPG(),
                               fillUps[i].getPrice(), fillUps[i].getCost());
            System.out.println();
        }
        System.out.println();
        System.out.printf("%8s", "Minimum:");
        System.out.printf("%41d", minDist);
        System.out.printf("%24.2f", minMPG);
        System.out.printf("%8.2f", minPrice);
        System.out.println();
        System.out.printf("%8s", "Maximum:");
        System.out.printf("%41d", maxDist);
        System.out.printf("%24.2f", maxMPG);
        System.out.printf("%8.2f", maxPrice);
        System.out.println();
        System.out.println();
        System.out.printf("%7s", "Totals:");
        System.out.printf("%42.0f", totalDist);
        System.out.printf("%14.2f", totalGalUsed);
        System.out.printf("%26.2f", totalCost);
        System.out.println();
        System.out.printf("%18s", "Annual Projection:");
        System.out.printf("%31.0f", annualDist);
        System.out.printf("%14.2f", annualGalUsed);
        System.out.printf("%10.2f", annualMPG);
        System.out.printf("%16.2f", annualCost);
    }
}
