/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Ian Jackson
 * Date: 9/17/2018
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        
        double kilometers;                      // distance in kilometers
        double milesPerKilometer = 1.609344;    //number of miles per 1 kilometer
       
        double pounds;                          //weight in pounds
        double kilograms;                       //weight in kilograms
        double poundsPerKilograms = 0.45359237; //number of pounds per 1 kilograms
        
        double gallons;                         //volume in gallons
        double liters;                          //volume in liters
        double gallonsPerLiters = 3.78541178;   //number of gallons per 1 liter
        
        double USD;                             //amount in US Dollars
        double EUR;                             //amount in EU Euros
        double usdPerEur = 0.86;                //number of Dollars per 1 Euro (As of 9/17/2018)
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        //convert miles to feet
        miles = 3;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 5;
        kilometers = miles * milesPerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        
        //convert kilometers to miles
        kilometers = 4;
        miles = kilometers / milesPerKilometer;
        System.out.println(kilometers + " km. = " + miles + " km.");
        
        //convert pounds to kilograms
        pounds = 140;
        kilograms = pounds * poundsPerKilograms;
        System.out.println(pounds + " lbs. = " + kilograms + " kg.");
        
        //kilograms to pounds
        kilograms = 72;
        pounds = kilograms / poundsPerKilograms;
        System.out.println(kilograms + " kg. = " + pounds + " lbs.");
        
        //gallons to liters
        gallons = 53;
        liters = gallons * gallonsPerLiters;
        System.out.println(gallons + " gal. = " + liters + " l.");
        
        //liters to gallons
        liters = 2;
        gallons = liters / gallonsPerLiters;
        System.out.println(liters + " l. = " + gallons + " gal.");
        
        //USD to EUR
        USD = 28.52;
        EUR = USD * usdPerEur;
        System.out.println("$" + USD + " = " + "€" + EUR); 
        
        //EUR to USD
        EUR = 32;
        USD = EUR / usdPerEur;
        System.out.println("€" + EUR + " = " + "$" + USD);   
        
        
        System.out.println(((int)-5.2 + 1));
    }//end of main method
}//end of class

