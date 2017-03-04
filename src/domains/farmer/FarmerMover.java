/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.Mover;
import framework.problem.State;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tyler
 */
public class FarmerMover extends Mover {
    
    public static final String FARMER = "Farmer goes alone";
    public static final String WOLF = "Farmer brings wolf";
    public static final String GOAT = "Farmer brings goat";
    public static final String CABBAGE = "Farmer brings cabbage";
    
    public FarmerMover() {
            super.addMove(FARMER, s -> tryFarmer((FarmerState)s));
            super.addMove(WOLF, s -> tryWolf((FarmerState)s));
            super.addMove(GOAT, s -> tryGoat((FarmerState)s));
            super.addMove(CABBAGE, s -> tryCabbage((FarmerState)s));
    }
    
    private static final List<FarmerState> INVALID_STATES = Arrays.asList(
        new FarmerState( Pos.EAST, Pos.WEST, Pos.WEST, Pos.WEST ),
        new FarmerState( Pos.EAST, Pos.WEST, Pos.WEST, Pos.EAST ),
        new FarmerState( Pos.EAST, Pos.EAST, Pos.WEST, Pos.WEST ),
        new FarmerState( Pos.WEST, Pos.EAST, Pos.EAST, Pos.WEST ),
        new FarmerState( Pos.WEST, Pos.WEST, Pos.EAST, Pos.EAST ),
        new FarmerState( Pos.WEST, Pos.EAST, Pos.EAST, Pos.EAST )
    );
    
    private State validateState( FarmerState state ) {
        if ( INVALID_STATES.stream().anyMatch( invalidSate -> invalidSate.equals( state ) ) ) {
            return null;
        }
        return state;
    }
        
    private State tryFarmer(FarmerState currentState) {
        FarmerState newState = new FarmerState(
                currentState.getFarmer() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getWolf(),
                currentState.getGoat(),
                currentState.getCabbage()
        );
        return validateState( newState );
    }
    
    private State tryWolf(FarmerState currentState) {
        FarmerState newState = new FarmerState(
                currentState.getFarmer() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getWolf() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getGoat(),
                currentState.getCabbage()
        );
        return validateState( newState );
    }
    
    private State tryGoat(FarmerState currentState) {
        FarmerState newState = new FarmerState(
                currentState.getFarmer() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getWolf(),
                currentState.getGoat() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getCabbage()
        );
        return validateState( newState );
    }

    private State tryCabbage(FarmerState currentState) {
        FarmerState newState = new FarmerState(
                currentState.getFarmer() == Pos.EAST ? Pos.WEST : Pos.EAST,
                currentState.getWolf(),
                currentState.getGoat(),
                currentState.getCabbage() == Pos.EAST ? Pos.WEST : Pos.EAST
        );
        return validateState( newState );
    }
            
}
