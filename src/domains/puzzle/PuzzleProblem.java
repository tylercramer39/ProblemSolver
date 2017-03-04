/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.puzzle;

import framework.problem.Problem;

/**
 *
 * @author Tyler
 */
    public class PuzzleProblem extends Problem {
        
        public PuzzleProblem() {

            super.setName("8-Puzzle");
            super.setIntroduction(INTRO);
            super.setMover(new PuzzleMover());
            
            super.setInitialState(Start);
            super.setCurrentState(Start);
            super.setFinalState(Goal);
        }
        
        private static final PuzzleState Start = new PuzzleState(new int[][] { {2,8,3}, {1,6,4}, {7,0,5} });
        private static final PuzzleState Goal = new PuzzleState(new int[][] { {1,2,3}, {8,0,4}, {7,6,5} });
        
        private static final String INTRO =
            "You are given a board in which numbered tiles can slide around. "
            + "There is one blank space that holds no tile.  A legal move consists "
            + "of sliding a tile into the blank space if the tile is adjacent to it. "
            + "The goal is to move tiles around until the board looks like the "
            + "final state below.";
    
}
