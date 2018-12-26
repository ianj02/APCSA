
/**
 * @author Ian Jackson
 * @version 12/23/18
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
    public static void main(String[] args)
    {
        ArrayList<CO2FromWaste> CO2 = new ArrayList<CO2FromWaste>();
        
        CO2.add(new CO2FromWaste(3, true, true, false, false));
        CO2.add(new CO2FromWaste(5, false, false, false, false));
        CO2.add(new CO2FromWaste(1, true, true, true, true));
        CO2.add(new CO2FromWaste(3, false, true, false, true));
        CO2.add(new CO2FromWaste(2, true, false, false, true));
        CO2.add(new CO2FromWaste(6, true, false, true, false));
        CO2.add(new CO2FromWaste(5, true, true, true, false));
        
        CO2FromWaste dataRecord;
        CO2FromWaste printHeader;
        
        for (int i = 0; i < CO2.size(); i++)
        {
            dataRecord = CO2.get(i);
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteReduction();
        }
        
        printHeader = CO2.get(0);
        printHeader.printHeader();
        
        for (int i = 0; i < CO2.size(); i++)
        {
            dataRecord = CO2.get(i);
            
            System.out.printf("%1s %3d %3s", "|", i , "|");
            System.out.printf("%5d %4s", dataRecord.getPeople(), "|");
            System.out.printf("%2s %-7b %1s", " ", dataRecord.getPaper(), "|");
            System.out.printf("%2s %-7b %1s", " ", dataRecord.getPlastic(), "|");
            System.out.printf("%2s %-6b %1s", " ", dataRecord.getGlass(), "|");
            System.out.printf("%2s %-6b %1s", " ", dataRecord.getCans(), "|");
            System.out.printf("%10.2f %3s", dataRecord.getGrossEmission(), "|");
            System.out.printf("%11.2f %3s", dataRecord.getReduction(), "|");
            System.out.printf("%11.2f %2s", dataRecord.getNetEmission(), "|");
            
            System.out.println();
        }
    }
}
