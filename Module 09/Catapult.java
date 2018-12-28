
/**
 * @author Ian Jackson
 * @version 12/28/18
 */
public class Catapult
{
    //private instance variables
    private double speed, angle, distance;
    
    /**
     * Defualt constructor to create objects in the Catapult class
     * @param s speed
     * @param a angle
     */
    Catapult(double s, double a)
    {
        speed = s;
        angle = a;
        
        distance = 0;
    }
    
    /**
     * Mutator method to calculate the distance
     * @param distance distance the object is thrown
     */
    public void calcDist()
    {
        distance = (Math.pow(speed, 2) * Math.sin(2 * Math.toRadians(angle)) / 9.8);
    }
    
    /**
     * Getter method to get speed
     * @return speed
     */
    public double getSpeed()
    {
        return speed;
    }
    
    /**
     * Getter method to get angle
     * @return angle
     */
    public double getAngle()
    {
        return angle;
    }
    
    /**
     * Getter method to get the distance
     * @return distance
     */
    public double getDist()
    {
        return distance;
    }
}
