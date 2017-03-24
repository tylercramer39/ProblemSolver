/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.graph.Graph;
import framework.graph.Vertex;

/**
 * A graph for the FWGC problem.
 * @author Tyler Cramer
 */
public class FarmerGraph extends Graph {
    
    public FarmerGraph() {
        /* you must provide */
        addEdge( new Vertex(new FarmerState("West", "West", "West", "West")),
        new Vertex(new FarmerState("East", "West", "East", "West")) );
        
        addEdge( new Vertex(new FarmerState("West", "West", "East", "West")), 
        new Vertex(new FarmerState("East", "West", "East", "East")) );
        
        addEdge( new Vertex(new FarmerState("West", "West", "West", "East")),
        new Vertex(new FarmerState("East", "East", "East", "West")) );
        
        addEdge( new Vertex(new FarmerState("West", "East", "West", "West")), 
        new Vertex(new FarmerState("East", "East", "West", "East")) );
        
        addEdge( new Vertex(new FarmerState("West", "East", "West", "East")),
        new Vertex(new FarmerState("East", "East", "East", "East")) );
        
    }
    
    public Vertex getStart() {
        /* you must provide */
        Vertex start = new Vertex (new FarmerState("West", "West", "West", "West"));
        
        return start;
    }
    
    public Vertex getEnd() {
        /* you must provide */
        Vertex end = new Vertex(new FarmerState("East", "East", "East", "East"));
        
        return end;
    }
    
    /* private fields and methods follow */
    
}
