/**
 * Tests reference type behavior for copy operations using Counter class.
 * 
 * @author Acuna
 */
public class CounterTester1 {
    public static void main(String[] args) {
        Counter c1 = new Counter("First");
        Counter c2 = c1;
        c1.increment();
        c2.increment();
        System.out.println(c1);
        System.out.println(c2);
    }
}
