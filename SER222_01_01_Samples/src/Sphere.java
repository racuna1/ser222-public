/**
 * Represents a sphere cone shape with a radius.
 * 
 * @author Acuna
 * @version 1.0
 */public class Sphere extends RoundShape
{
    public Sphere(double r)
    {
        super(r);
    }
    
    public double GetArea()
    {
        return 4 * Math.PI * Math.pow(GetRadius(), 2);
    }
    
    public double GetVolume()
    {
        return (4.0/3)*Math.PI * Math.pow(GetRadius(), 3);
    } 
    
    String ToString()
    {
        return "A sphere of radius " + GetRadius() + ", area " + GetArea() + ", and volume " + GetVolume() + ".";
    }     
}