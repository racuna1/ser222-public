import java.util.Stack;
/**
 * Tests the priority queue ADT by finding top transactions.
 * 
 * @author Sedgewick and Wayne
 */
public class TopM {
    /**
     *  Reads a sequence of transactions from standard input; takes a
     *  command-line integer m; prints to standard output the m largest
     *  transactions in descending order.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); 
        MinPQ<Transaction> pq = new MinPQ<Transaction>(m+1);

        while (StdIn.hasNextLine()) {
            // Create an entry from the next line and put on the PQ. 
            String line = StdIn.readLine();
            Transaction transaction = new Transaction(line);
            pq.insert(transaction); 

            // remove minimum if m+1 entries on the PQ
            if (pq.size() > m) 
                pq.delMin();
        }   // top m entries are on the PQ

        // print entries on PQ in reverse order
        Stack<Transaction> stack = new Stack<>();
        for (Transaction transaction : pq)
            stack.push(transaction);
        for (Transaction transaction : stack)
            System.out.println(transaction);
    } 
}
