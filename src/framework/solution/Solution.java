/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.solution;

import framework.graph.Vertex;
import java.util.Stack;
/**
 *
 * @author Tyler
 */
public class Solution {

    /**
     * Creates an object that represents a path from a start
     * vertex to an end vertex in a problem solving domain.
     * This constructor will be called after a search has been
     * initiated on the start vertex.
     * If a path from start to end exists, it can be constructed
     * from the predecessor information stored in the end vertex.
     * @param start the start vertex
     * @param end the end vertex
     */
    public Solution(Vertex start, Vertex end) {
        /* you must provide */
        first = new Vertex(start);
        intermediate = new Vertex(end.getPredecessor() );
        last = new Vertex(end);
        stack = new Stack();
        
        currVertex = end;
        nextVertex = currVertex.getPredecessor();
        stack.push(currVertex);
        while(currVertex.getPredecessor() != null) {
            currVertex = currVertex.getPredecessor();
            stack.push(currVertex);
            moves++;
        }
        
        
        
        
    }

    /**
     * Gets the length of the solution, that is, the number of moves
     * to get to the end state from the start.
     * @return the solution length
     */
    public int getLength() {
        /* you must provide */
        return moves;
    }
    
    
    /**
     * Checks whether there are more vertices in this solution.
     * @return true if there are more vertices in this solution, false
     * otherwise
     */
    public boolean hasNext() {
        /* you must provide */
        if (stack.isEmpty() == true) {
            return false;
        }
        return true;
    }
    
    /**
     * Removes and returns the next vertex in this solution.
     * @return the next vertex in this solution
     * @throws RuntimeException if there are no more vertices
     */
    public Vertex next() {
        /* you must provide */
        if (count == 1) {
            help = intermediate;
        }
        if (count == 2) {
            help = last;
        }
        if (count == 0) {
            help = currVertex;
        }
        count++;
        stack.pop();
        return help;
    }
    
    /* private instance fields and methods here */
    private Vertex currVertex;
    private Vertex nextVertex;
    private Vertex first;
    private Vertex intermediate;
    private Vertex last;
    private Vertex help;
    private int moves;
    private int count;
    private Stack stack;
}
