/**
 * Simple implementation of Date class.
 * 
 * @author Oracle, Sedgewick and Wayne
 * @version 1.0
 */

public class Date implements Comparable<Date> {
    private final int month, day, year;

    public Date(int m, int d, int y) {
      month = m; 
      day   = d;
      year  = y;
   }

    @Override
    public int compareTo(Date that) {
        if (that.getClass() != this.getClass())
          throw new ClassCastException();

      if (this.year  < that.year ) return -1;
      if (this.year  > that.year ) return +1;
      if (this.month < that.month) return -1;
      if (this.month > that.month) return +1;
      if (this.day   < that.day  ) return -1;
      if (this.day   > that.day  ) return +1;
      return 0;
   }
}