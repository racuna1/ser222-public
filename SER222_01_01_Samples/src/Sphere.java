/**
 * Represents a sphere cone shape with a radius.
 * 
 * @author Acuna
 * @version 1.0
 */
public class Sphere extends RoundShape {

    public Sphere(double r)
    {
        super(r);
    }

    public double getArea()
    {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
    
    public double getVolume()
    {
        return (4.0/3)*Math.PI * Math.pow(getRadius(), 3);
    } 

    @Override
    public String toString() {
        return "A sphere of radius " + getRadius() + ", area " + getArea() + ", and volume " + getVolume() + ".";
    }
}