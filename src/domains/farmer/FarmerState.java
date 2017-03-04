/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.State;

enum Pos {
    WEST,  EAST;
}

/**
 *
 * @author Tyler
 */
public class FarmerState implements State {
    
        private final Pos farmer;
        private final Pos wolf;
        private final Pos goat;
        private final Pos cabbage;
  
        public FarmerState(Pos farmer, Pos wolf, Pos goat, Pos cabbage) {
          this.farmer = farmer;
          this.wolf = wolf;
          this.goat = goat;
          this.cabbage = cabbage;
        }

        public FarmerState(String farmer, String wolf, String goat, String cabbage) {
          this(toPos(farmer), toPos(wolf), toPos(goat), toPos(cabbage));
        }

        public Pos getFarmer() {
          return this.farmer;
        }

        public Pos getWolf() {
          return this.wolf;
        }

        public Pos getGoat() {
          return this.goat;
        }

        public Pos getCabbage() {
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

          buf.append(this.farmer == Pos.WEST ? fWest : fEast);
          buf.append(this.wolf == Pos.WEST ? wWest : wEast);
          buf.append(this.goat == Pos.WEST ? gWest : gEast);
          buf.append(this.cabbage == Pos.WEST ? cWest : cEast);

          buf.append(end);
   
          return buf.toString();
        }

        private static Pos toPos(String s) {
          if (s.equalsIgnoreCase("west")) {
            return Pos.WEST;
          }
          if (s.equalsIgnoreCase("east")) {
            return Pos.EAST;
          }
          throw new RuntimeException("Bad side: " + s);
        }
      

}
