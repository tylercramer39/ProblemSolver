/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.arithmetic;

import framework.problem.Mover;
import framework.problem.State;

/**
 *
 * @author Tyler
 */
public class ArithmeticMover extends Mover{
    
    public ArithmeticMover() {
            super.addMove(ADD3, s -> tryAdd(s));
            super.addMove(SUB5, s -> trySub(s));
            super.addMove(MUL2, s -> tryMul(s));
            super.addMove(DIV2, s -> tryDiv(s));
            
    }
        
        /**
         * add 3 to our value 
         * @param s, is the state of the our current value
         * @return  returns the object as a new state +3
         */

    private State tryAdd(State s) {
        ArithmeticState thing =(ArithmeticState)s;
        int obj=thing.getContents();
        thing = new ArithmeticState(obj+3);
        return thing;
    }
    

    /**
     * subtracts 3 from our value
     * @param s, current state of our value
     * @return new state with value minus 5
     */
        
    private State trySub(State s) {
        ArithmeticState thing =(ArithmeticState)s;
        int obj=thing.getContents();
        thing = new ArithmeticState(obj-5);
        return thing;
    }
    
         
         /**
          * multiplies current state by 2
          * @param s, current state of our value
          * @return returns the news state value * 2
          */
    private State tryMul(State s) {
        ArithmeticState thing =(ArithmeticState)s;
        int obj=thing.getContents();
        thing = new ArithmeticState(obj*2);
        return thing;
    }

          /**
           * divides by 3
           * @param s, current state of our value
           * @return new state divided by 2
           */
    private State tryDiv(State s) {
        ArithmeticState thing =(ArithmeticState)s;
        int obj=thing.getContents();
        return thing = new ArithmeticState(obj/2);
    }
        public static final String ADD3 = "Add 3";
        public static final String SUB5 = "Subtract 5";
        public static final String MUL2 = "Multiply by 2";
        public static final String DIV2 = "Divide by 2";
}
