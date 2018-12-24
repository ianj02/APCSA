
/**
 * @author Ian Jackson
 * @version 12/23/18
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
    private double avgBill;
    private double avgPrice;
    private double emissions;
    
    /*
     * Defualt constructor to create an object from the CO2FromElectricity class
     */
    CO2FromElectricity() 
    {
        avgBill = 0;
        avgPrice = 0;
        emissions = 0;
    }
    
    /*
     * Mutator method that calculates the average annual electricity bill
     * @param monthlyBill an Arraylist containing the monthly bills for home electricity use
     * @return The average monthly electricity bill
     */
    public double calcAverageBill(ArrayList<Double> monthlyBill)
    {
        double total = 0;
        
        for (int i = 0; i < monthlyBill.size(); i++)
        {
            total += monthlyBill.get(i);
        }
        
        avgBill = total / monthlyBill.size();
        return avgBill;
    }
    
    /*
     * Mutator method that calculates the average annual price of electricity
     * @param monthlyPrice an ArrayList containing the monthly price of electricity per kilowatthour
     * @return The average monthly price of electricity
     */
    public double calcAveragePrice(ArrayList<Double> monthlyPrice)
    {
        double total = 0;
        
        for (int i = 0; i < monthlyPrice.size(); i++)
        {
            total += monthlyPrice.get(i);
        }
        
        avgPrice = total / monthlyPrice.size();
        return avgPrice;
    }
    
    /*
     * Mutator method that calculates the annual home CO2 emission from electricity
     * @param avgBill the average monthly home electricty bill
     * @param avgPrice the average monthly price of home electricity
     * @return The annual home CO2 emission from home electricity use
     */
    public double calcElectricityCO2(double avgBill, double avgPrice)
    {
        emissions = (avgBill / avgPrice) * 1.37 * 12;
        return emissions;
    }
}

