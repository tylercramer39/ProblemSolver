/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.Mover;
import framework.problem.State;

/**
 *
 * @author Tyler
 */
public class FarmerMover extends Mover {
    
    public FarmerMover() {
            super.addMove(farmer, s -> tryFarmer(s));
            super.addMove(wolf, s -> tryWolf(s));
            super.addMove(goat, s -> tryGoat(s));
            super.addMove(cabbage, s -> tryCabbage(s));
            
    }
        
    private State tryFarmer(State s) {
        FarmerState thing =(FarmerState)s;
        thing = new FarmerState("East", "West", "West", "West");
        return thing;
    }
    
    private State tryWolf(State s) {
        FarmerState thing =(FarmerState)s;
        thing = new FarmerState("West","East", "West", "West");
        return thing;
    }
    
    private State tryGoat(State s) {
        FarmerState thing =(FarmerState)s;
        thing = new FarmerState("West","West","East","West");
        return thing;
    }

    private State tryCabbage(State s) {
        FarmerState thing =(FarmerState)s;
        thing = new FarmerState("West","West","West","East");
        return thing;
    }
        public static final String farmer = "Farmer goes alone";
        public static final String wolf = "Farmer brings wolf";
        public static final String goat = "Farmer brings goat";
        public static final String cabbage = "Farmer brings cabbage";
    
}
