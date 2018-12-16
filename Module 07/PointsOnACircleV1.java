
/**
 * Write a description of class PointsOnACircleV1 here.
 *
 * @author Ian Jackson
 * @version 12/7/2018
 */
public class PointsOnACircleV1
{
    public static void main (String [] args)
    {
        double radius = 1;
        double xCord = 1;
        double factor = -1;
        double yCord;
        
        double subFact = xCord * Math.pow(10, factor);
        
        System.out.printf("%35s", "Points on a Circle of Radius 1.0");
        System.out.println();
        System.out.printf("%5s", "x1");
        System.out.printf("%8s", "y1");
        System.out.printf("%14s", "x1");
        System.out.printf("%8s", "y1");
        System.out.println();
        
        for (int i = 0; i < 46; i++)
        {
            System.out.print("-");
        }
        
        System.out.println();
        
        for (int i = 0; i < 21; i++)
        {
            System.out.printf("%6.2f", xCord);
            yCord = Math.abs(-Math.sqrt(Math.pow(radius, 2) - Math.pow(xCord, 2)));
            System.out.printf("%8.2f", yCord);
            System.out.printf("%14.2f", xCord);
            yCord = -Math.sqrt(Math.pow(radius, 2) - Math.pow(xCord, 2));
            System.out.printf("%8.2f", yCord);
            System.out.println();
            xCord -= subFact;
        }
    }
}
