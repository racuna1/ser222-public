/**
 * Represents a generic cone shape with a radius and height.
 * 
 * @author Acuna
 * @version 1.0
 */
public class Cone extends RoundShape {
    private double height;

    public Cone(double r, double h) {
        super(r);
        height = h;
    }        

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double r)
    {
        height = r;
    }

    public double getArea() {
        return Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2)));
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * (getHeight()/3);
    }

    @Override
    public String toString() {
        return "A cone of radius " + getRadius() + ", area " + getArea() + ", and volume " + getVolume() + ".";
    }
}