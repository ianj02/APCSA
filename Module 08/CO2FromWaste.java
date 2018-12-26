
/**
 * @author Ian Jackson
 * @version 12/23/18
 */
public class CO2FromWaste
{
    private int numPpl;
    private boolean paper, plastic, glass, cans;
    private double totalEmission, reduction, netEmission;
    
    /*
     * Defualt construtor to create object
     * @param numPeople the number of people in a household
     * @param paperTF if paper is being recycled
     * @param plasticTF if plastic is being recycled
     * @param glassTF if glass is being recycled
     * @param cansTF if cans are being recycled
     */
    CO2FromWaste(int numPeople, boolean paperTF, boolean plasticTF, boolean glassTF, boolean cansTF)
    {
        numPpl = numPeople;
        paper = paperTF;
        plastic = plasticTF;
        glass = glassTF;
        cans = cansTF;
        
        totalEmission = 0;
        reduction = 0;
        netEmission = 0;
    }
    
    /*
     * Mutator method to calculate gross waste emission
     */
    public void calcGrossWasteEmission()
    {
        totalEmission = numPpl * 1018;
    }
    
    /*
     * Mutator method to calculate the amount of pounds of CO2 to reduce
     */
    public void calcWasteReduction()
    {
        if (paper == true)
        {
            reduction += 184.0;
        }
        if (plastic == true)
        {
            reduction += 25.6;
        }
        if (glass == true)
        {
            reduction += 46.6;
        }
        if (cans == true)
        {
            reduction += 165.8;
        }
    }
    
    /*
     * Mutator method to calculate the net pounds of CO2 emitted
     */
    public void calcNetWasteReduction()
    {
        netEmission = totalEmission - reduction;
    }
    
    /*
     * Getter method to get the number of people in a household
     * @return the number of people in a household
     */
    public int getPeople()
    {
        return numPpl;
    }
    
    /*
     * Getter method to get if the household recycles paper
     * @return boolean value based on if household recycles paper
     */
    public boolean getPaper()
    {
        return paper;
    }
    
    /*
     * Getter method to get if the household recycles plastic
     * @return boolean value based on if household recycles plastic
     */
    public boolean getPlastic()
    {
        return plastic;
    }
    
    /*
     * Getter method to get if the household recycles glass
     * @return boolean value based on if household recycles glass
     */
    public boolean getGlass()
    {
        return glass;
    }
    
    /*
     * Getter method to get if the household recycles cans
     * @return boolean value based on if household recycles cans
     */
    public boolean getCans()
    {
        return cans;
    }
    
    /*
     * Getter method to get the gross emission
     * @return the gross emission
     */
    public double getGrossEmission()
    {
        return totalEmission;
    }
    
    /*
     * Getter method to get the reduction amount
     * @return the amount of pounds of CO2 to reduce by
     */
    public double getReduction()
    {
        return reduction;
    }
    
    /*
     * Getter method to get the net emission
     * @return the net CO2 emission
     */
    public double getNetEmission()
    {
        return netEmission;
    }
    
    public void printHeader()
    {
        System.out.printf("%1s %7s %9s %45s", "|", "|", "|", "|");
        System.out.printf("%27s %15s", "Pounds of CO2", "|");
        System.out.println();
        System.out.printf("%1s %7s %9s %30s %14s %8s %4s %14s %7s %5s",
                          "|", "|", "|", "Household Waste Recycled",
                          "|", "Total", "|", "|", "Net", "|");
        System.out.println();
        System.out.printf("%9s %9s %11s %11s %10s %10s %12s %14s %13s", "| Index |",
                           " People |", "  Paper   |", "  Plastic |",
                          "  Glass  |", "  Cans   |", "  Emission  |",
                          "  Reduction  |", "  Emission  |");
        System.out.println();
        System.out.print("|-------|---------|-----------|-----------|----------|");
        System.out.print("----------|-------------|--------------|-------------|");
        System.out.println();
    }
}
