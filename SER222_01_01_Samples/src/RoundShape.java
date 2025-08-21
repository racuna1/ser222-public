/**
 * Represents a top-level model for a geometric shape with radial symmetry.
 * 
 * @author Acuna
 * @version 1.0
 */
public abstract class RoundShape {

    private double radius;

    public RoundShape(double r) {
        this.radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public abstract double getArea();

    public abstract double getVolume();
}