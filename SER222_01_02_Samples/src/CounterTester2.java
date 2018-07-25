/**
 * Tests reference type behavior for method calls using Counter class.
 * 
 * @author Acuna
 */
public class CounterTester2 {
    public static void foobar(Counter c) {
        c.increment();
        System.out.println(c);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter("First");
        c1.increment();
        foobar(c1);
        System.out.println(c1);
    }
}
