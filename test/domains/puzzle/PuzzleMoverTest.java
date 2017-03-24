/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.puzzle;

import framework.problem.Mover;
import framework.problem.State;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Your name here
 */
public class PuzzleMoverTest {
        
    /**
     * Declare private instance fields here. For example:
     */
    
    private final State start;
    private final Mover mover;
    private final String slide1, slide2, slide3, slide4,  // move names
	                 slide5, slide6, slide7, slide8;
    
    public PuzzleMoverTest() {
        
        start = new PuzzleState (
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{7, 0, 5}});  
        mover = new PuzzleMover();
        
        moveNames = mover.getMoveNames();
        slide1 = moveNames.get(0);
        slide2 = moveNames.get(1);
        slide3 = moveNames.get(2);
        slide4 = moveNames.get(3);
        slide5 = moveNames.get(4);
        slide6 = moveNames.get(5); 
        slide7 = moveNames.get(6);
        slide8 = moveNames.get(7);
        
    }
    
    /**
     * Test all moves in the methods below by replacing the calls to fail.
     */

    @Test
    public void testSlide1() {
        /**
         * For example, if mover, start, and slide1 have been
         * initialized, call:
         *
         *     mover.doMove(slide1, start)
         *
         * and test the result with assertions.
         */
        PuzzleState start1= new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{0, 8, 4}, 
                            new int[]{7, 5, 6}});
  State next = mover.doMove(slide1, start1);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{0, 2, 3}, 
                            new int[]{1, 8, 4}, 
                            new int[]{7, 5, 6}})));  
    }

@Test
    public void testSlide2(){
        PuzzleState start1= new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 5, 6}});
  State next = mover.doMove(slide2, start1);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 0, 3}, 
                            new int[]{8, 2, 4}, 
                            new int[]{7, 5, 6}}))); 
    }

    @Test
    public void testSlide3() {
   PuzzleState start1= new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 4, 0}, 
                            new int[]{7, 5, 6}});
  State next = mover.doMove(slide3, start1);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 0}, 
                            new int[]{8, 4, 3}, 
                            new int[]{7, 5, 6}}))); 
    }

    @Test
    public void testSlide4() {
   PuzzleState start1= new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 5, 6}});
  State next = mover.doMove(slide4, start1);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 4, 0}, 
                            new int[]{7, 5, 6}}))); 
    }

    @Test
    public void testSlide5() {
    State next = mover.doMove(slide5, start);


assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{7, 5, 0}})));        
    }

    @Test
    public void testSlide6() {
       State next = mover.doMove(slide6, start);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}}))); 
    }

    @Test
    public void testSlide7() {
             State next = mover.doMove(slide7, start);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{0, 7, 5}}))); 
    }

    @Test
    public void testSlide8() {
   PuzzleState start1= new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 5, 6}});
  State next = mover.doMove(slide8, start1);
 assertTrue(next.equals(new PuzzleState( new int[][]{new int[]{1, 2, 3}, 
                            new int[]{0, 8, 4}, 
                            new int[]{7, 5, 6}}))); 
    }
    
   
    private final List<String> moveNames;
    
    private State next;
    
    private enum Message {EXCEPTION_OCCURRED, NO_EXCEPTION_OCCURRED};
}
