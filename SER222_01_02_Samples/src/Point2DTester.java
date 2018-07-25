/**
 * Tests Point2D class by creating and comparing two points.
 * 
 * @author Acuna
 */
public class Point2DTester {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 5);
        Point2D p2 = new Point2D(3, 5);

        if(p1 == p2) //Java will compare addresses so this is false.
            System.out.println("Dist is 0.");
        else
            System.out.println("Dist is " +   
                          p1.distanceTo(p2));

        System.out.println(p1.x());
        System.out.println(p2.theta());
    }
}
