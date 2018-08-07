/**
 * Represents a top-level model for a geometric shape with radial symmetry.
 * 
 * @author Acuna
 * @version 1.0
 */
public abstract class RoundShape
{
    private double radius;
    
    public RoundShape(double r)
    {
        radius = r;
    }
    
    public double GetRadius()
    {
        return radius;
    }
    
    public void SetRadius(double r)
    {
        radius = r;
    }
    
    public abstract double GetArea();
    public abstract double GetVolume();
}