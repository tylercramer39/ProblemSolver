/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.State;

/**
 *
 * @author Tyler
 */
public class FarmerState implements State {
    
        private final pos farmer;
        private final pos wolf;
        private final pos goat;
        private final pos cabbage;
  
        public static enum pos {
          West,  East;

          private pos() {}
        }

        public FarmerState(pos farmer, pos wolf, pos goat, pos cabbage) {
          this.farmer = farmer;
          this.wolf = wolf;
          this.goat = goat;
          this.cabbage = cabbage;
        }

        public FarmerState(String farmer, String wolf, String goat, String cabbage) {
          this(toPos(farmer), toPos(wolf), toPos(goat), toPos(cabbage));
        }

        public pos getFarmer() {
          return this.farmer;
        }

        public pos getWolf() {
          return this.wolf;
        }

        public pos getGoat() {
          return this.goat;
        }

        public pos getCabbage() {
          return this.cabbage;
        }

        public boolean equals(Object other) {
          if (this == other) {
            return true;
          }
          if (other == null) {
            return false;
          }
          if (getClass() != other.getClass()) {
            return false;
          }
          FarmerState state = (FarmerState)other;
          return (this.farmer == state.farmer) && (this.wolf == state.wolf) && (this.goat == state.goat) && (this.cabbage == state.cabbage);
        }

        public String toString() {
          StringBuilder buf = new StringBuilder();

          String start = "   |  |   \n";
          String fWest = " F |  |   \n";
          String fEast = "   |  | F \n";
          String wWest = " W |  |   \n";
          String wEast = "   |  | W \n";
          String gWest = " G |  |   \n";
          String gEast = "   |  | G \n";
          String cWest = " C |  |   \n";
          String cEast = "   |  | C \n";
          String end = "   |  |   ";

          buf.append(start);

          buf.append(this.farmer == pos.West ? fWest : fEast);
          buf.append(this.wolf == pos.West ? wWest : wEast);
          buf.append(this.goat == pos.West ? gWest : gEast);
          buf.append(this.cabbage == pos.West ? cWest : cEast);

          buf.append(end);
   
          return buf.toString();
        }

        private static pos toPos(String s) {
          if (s.equalsIgnoreCase("west")) {
            return pos.West;
          }
          if (s.equalsIgnoreCase("east")) {
            return pos.East;
          }
          throw new RuntimeException("Bad side: " + s);
        }
      

}
