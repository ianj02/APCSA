
/**
 * @author Ian Jackson
 * @version 12/27/18
 */

import java.util.ArrayList;

public class CO2FootprintTester
{
    public static void main(String [] args)
    {
        ArrayList<CO2Footprint> CO2 = new ArrayList<CO2Footprint>();
        
        CO2.add(new CO2Footprint(885.39, 199.0, 9.27, 5, false, false, false, false, 0));
        CO2.add(new CO2Footprint(516.18, 91.3, 0.16, 3, true, true, true, true, 4));
        CO2.add(new CO2Footprint(1927.33, 216.4, 3.20, 2, true, false, false, true, 2));
        CO2.add(new CO2Footprint(827.12, 214.21, 8.23, 4, true, true, false, false, 3));
        CO2.add(new CO2Footprint(927.69, 133.45, 4.20, 3, false, false, true, true, 6));
        
        CO2Footprint dataRecord;
        CO2Footprint printHeader;
        
        for (int i = 0; i < CO2.size(); i++)
        {
            dataRecord = CO2.get(i);
            
            dataRecord.calcCO2FromGas();
            dataRecord.calcCO2FromElect();
            dataRecord.calcCO2FromWaste();
            dataRecord.calcCO2Gross();
            dataRecord.calcCO2FromRecycle();
            dataRecord.calcCO2FromBulb();
            dataRecord.calcCO2Net();
        }
        
        printHeader = CO2.get(0);
        printHeader.printHeader();
        
        for (int i = 0; i < CO2.size(); i++)
        {
            dataRecord = CO2.get(i);
            
            System.out.printf("%1s%10.2f%3s", "|", dataRecord.getlbsCO2Gas(), "|");
            System.out.printf("%14.2f%4s", dataRecord.getlbsCO2Elect(), "|");
            System.out.printf("%9.2f%3s", dataRecord.getlbsCO2Waste(), "|");
            System.out.printf("%11.2f%4s", dataRecord.getlbsCO2Recycle(), "|");
            System.out.printf("%11.1f%4s", dataRecord.getlbsCO2Bulbs(), "|");
            System.out.printf("%15.2f%4s", dataRecord.getlbsCO2Net(), "|");
            
            System.out.println();
        }
    }
}
