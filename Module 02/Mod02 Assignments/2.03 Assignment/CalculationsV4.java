
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * FLVS 2007
 * @author Ian Jackson
 * @v3 9/10
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 25;
        int iNum2 = 90;
        int iNum3 = 16;
        int iNum4 = 5;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " plus " + iNum2 + " equals " + (iNum1 + iNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " minus " + iNum2 + " minus " + iNum1 + " equals " + (iNum3-iNum2-iNum1));
        System.out.println();
        System.out.println("3.14" + " minus " + iNum4 + " equals " + (3.14 - iNum4));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " times " + iNum2 + " equals " + (iNum1 * iNum2));
        System.out.println();
        System.out.println("3.14" + " times " + iNum4 + " times " + iNum4 + " equals " + (3.14 * iNum4 * iNum4));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " divided by " + iNum1 + " equals " + (iNum2 / iNum1));
        System.out.println();
        System.out.println("43.21" + " divided by " + iNum4 + " equals " + (43.21 / iNum4));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " Modulus " + iNum2 + " equals " + (iNum3 % iNum2));
        System.out.println();
        System.out.println( iNum4 + " Modulus " +  "3.14" + " equals " + (iNum4 % 3.14));
        System.out.println();
        
        System.out.println("2.02 Lab Equations");
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5");
        System.out.println(15/2.5*-2+10/5);
        System.out.println();
        
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3");
        System.out.println(234-(234/6%12)+3);
        System.out.println();
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)");
        System.out.println((46.2/11)-3+24%(17-2*3));
        System.out.println();
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8");
        System.out.println(480/10/12+200*0.5-20%8);
        System.out.println();
        
        System.out.println("2.03 Additional int Equations");
        System.out.println(iNum1 + " minus " + iNum3 + " times " + iNum2 + " equals " + (iNum1 - iNum3 * iNum2));
        System.out.println(iNum4 + " times " + iNum1 + " divided by " + iNum4 + " equals " + (iNum4 * iNum1 / iNum4));
        System.out.println(iNum1 + " modulus " + iNum4 + " equals " + (iNum1 % iNum4));
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
