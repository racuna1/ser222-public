/**
 * Represents a real point on a 2D plan. Provides both Cartesian and polar
 * coordinates.
 * 
 * @author Sedgewick and Wayne, Acuna
 * @version 1.0
 */
public final class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
        
        //checks to prevent creation of malformed point
        if (Double.isInfinite(x) || Double.isInfinite(y))
            throw new IllegalArgumentException("Coordinates must be finite");
        if (Double.isNaN(x) || Double.isNaN(y))
            throw new IllegalArgumentException("Coordinates cannot be NaN");
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double r() {
        return Math.sqrt(x*x + y*y);
    }

    public double theta() {
        return Math.atan2(y, x);
    }
 
    public double distanceTo(Point2D that) {
        double dx = this.x - that.x();
        double dy = this.y - that.y();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) return true; //fast check for self comparison
        if (other == null) return false;
        if (other.getClass() != this.getClass())
           return false;
        Point2D p = (Point2D) other;
        return this.x() == p.x() &&  this.y() == p.y();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

