/**
 * Undirected graph data interface.
 * 
 * @author Sedgewick and Wayne, Acuna
 */

public interface Graph {

    /**
     * Returns the number of vertices in this graph.
     *
     * @return the number of vertices in this graph
     */
    public int V();

    /**
     * Returns the number of edges in this graph.
     *
     * @return the number of edges in this graph
     */
    public int E();

    /**
     * Adds the undirected edge v-w to this graph.
     *
     * @param  v one vertex in the edge
     * @param  w the other vertex in the edge
     */
    public void addEdge(int v, int w);

    /**
     * Returns the vertices adjacent to vertex {@code v}.
     *
     * @param  v the vertex
     * @return the vertices adjacent to vertex {@code v}, as an iterable
     */
    public Iterable<Integer> adj(int v);

    /**
     * Returns a string representation of this graph.
     *
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *         followed by the <em>V</em> adjacency lists
     */
    public String toString();

}