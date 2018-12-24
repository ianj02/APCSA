
/**
 * Write a description of class CO2FromElectricityTester here.
 *
 * @author Ian Jackson
 * @version 12/23/18
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
    public static void main(String[] args)
    {
        //Declare and initialize ArrayLists
        ArrayList<Double> monthlyBill = new ArrayList<Double>();
        ArrayList<Double> monthlyPrice = new ArrayList<Double>();
        
        //Add monthly bills to monthlyBill ArrayList
        monthlyBill.add(172.0);
        monthlyBill.add(178.0);
        monthlyBill.add(179.0);
        monthlyBill.add(184.0);
        monthlyBill.add(186.0);
        monthlyBill.add(373.0);
        monthlyBill.add(188.0);
        monthlyBill.add(190.0);
        monthlyBill.add(192.0);
        monthlyBill.add(195.0);
        monthlyBill.add(156.0);
        
        //Add price of electricity to monthlyPrice ArrayList
        monthlyPrice.add(19.90);
        monthlyPrice.add(15.17);
        monthlyPrice.add(12.86);
        monthlyPrice.add(10.66);
        monthlyPrice.add(5.82);
        monthlyPrice.add(2.45);
        monthlyPrice.add(7.53);
        monthlyPrice.add(5.93);
        monthlyPrice.add(5.87);
        monthlyPrice.add(7.15);
        monthlyPrice.add(8.01);
        monthlyPrice.add(9.85);
        
        
        //declare variables
        double avgBill;
        double avgPrice;
        double emissions;
        
        //create object
        CO2FromElectricity CO2Elect = new CO2FromElectricity();
        
        //calculate avg bill, price, & emissions
        avgBill = CO2Elect.calcAverageBill(monthlyBill);
        avgPrice = CO2Elect.calcAveragePrice(monthlyPrice);
        emissions = CO2Elect.calcElectricityCO2(avgBill, avgPrice);
        
        //print results
        System.out.print("Average Monthly Electricity Bill: ");
        System.out.printf("$%5.2f", avgBill);
        System.out.println();
        System.out.print("Average Monthly Electricity Price: ");
        System.out.printf("$%4.2f", avgPrice);
        System.out.println();
        System.out.print("Annual CO2 Emissions from Electricity Usage: ");
        System.out.printf("%5.1f", emissions);
        System.out.print(" pounds");
        
    }
}
