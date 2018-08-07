/**
 * Represents a generic cone shape with a radius and height.
 * 
 * @author Acuna
 * @version 1.0
 */
public class Cone extends RoundShape
{
    private double height;
    
    public Cone(double r, double h)
    {
        super(r);
        height = h;
    }        
    
    public double GetHeight()
    {
        return height;
    }
    
    public void SetHeight(double r)
    {
        height = r;
    }
    
    public double GetArea()
    {
        return Math.PI * GetRadius() * (GetRadius() + Math.sqrt(Math.pow(GetHeight(), 2) + Math.pow(GetRadius(), 2)));
    }
    
    public double GetVolume()
    {
        return Math.PI * Math.pow(GetRadius(), 2) * (GetHeight()/3);
    }
    
    String ToString()
    {
        return "A cone of radius " + GetRadius() + ", area " + GetArea() + ", and volume " + GetVolume() + ".";
    }
} 