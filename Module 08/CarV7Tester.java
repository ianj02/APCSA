
/**
 * Write a description of class CarV7Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarV7Tester
{
    public static void main (String [] args)
    {
        CarV7 Car1 = new CarV7("09 Nissan Frontier", 103915, 103650, 17.67, 2.45);
        CarV7 Car2 = new CarV7("01 Ford F-350     ", 140750, 140500, 20.8, 3.05);
        CarV7 Car3 = new CarV7("16 Prius Prime    ", 56837, 56736, 1.74, 2.56);
        
        Car1.printHeader();
        
        Car1.printResults();
        Car2.printResults();
        Car3.printResults();
    }
}
