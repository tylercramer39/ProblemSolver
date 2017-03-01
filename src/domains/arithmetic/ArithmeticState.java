/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
*/
package domains.arithmetic;

import framework.problem.State;
import java.util.stream.Stream;

/**
 *
 * @author Tyler
 */

public class ArithmeticState implements State {
    
    public ArithmeticState(Integer contents) {
            this.contents = contents;
        }

        @Override
        public boolean equals(Object other) {
            ArithmeticState otherArithmetic = (ArithmeticState) other;
            return this.contents == (otherArithmetic.contents);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            //addDashes(sb, maxLength + 2);
            sb.append(String.format("The Value is: " + contents));
            return sb.toString();
        }
        
        public void addDashes(StringBuilder sb, int n) {
            sb.append("+");
            for (int i = 0; i < n; i++) {
                sb.append("-");
            }
            sb.append("+");
        }
        
        private final int contents;
        private static final String NEW_LINE = "\n";
        
        public int getContents() {
        return contents;
    }
}