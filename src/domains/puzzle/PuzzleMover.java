/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.puzzle;

import framework.problem.Mover;
/**
 *
 * @author Tyler
 */
public class PuzzleMover extends Mover {

    public static final String slide1 = "SLIDE TILE 1";
    public static final String slide2 = "SLIDE TILE 2";
    public static final String slide3 = "SLIDE TILE 3";
    public static final String slide4 = "SILDE TILE 4";
    public static final String slide5 = "SLIDE TILE 5";
    public static final String slide6 = "SLIDE TILE 6";
    public static final String slide7 = "SLIDE TILE 7";
    public static final String slide8 = "SLIDE TILE 8";

    public PuzzleMover() {
        super.addMove(slide1, s -> trySlide1((PuzzleState) s));
        super.addMove(slide2, s -> trySlide2((PuzzleState) s));
        super.addMove(slide3, s -> trySlide3((PuzzleState) s));
        super.addMove(slide4, s -> trySlide4((PuzzleState) s));
        super.addMove(slide5, s -> trySlide5((PuzzleState) s));
        super.addMove(slide6, s -> trySlide6((PuzzleState) s));
        super.addMove(slide7, s -> trySlide7((PuzzleState) s));
        super.addMove(slide8, s -> trySlide8((PuzzleState) s));
    }

    private PuzzleState trySlide1(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(1);
        PuzzleState.Location blank = state.getLocation(0);
    if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
    && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
        if ((tiles.getRow() + 1 == blank.getRow() ) && tiles.getColumn() == blank.getColumn()) {
            PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
            return new PuzzleState(state, tiles, location);
        }
        else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
            PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
            return new PuzzleState(state, tiles, location);
        } 
        else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
            PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
            return new PuzzleState(state, tiles, location);
        }
        else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
            PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
            return new PuzzleState(state, tiles, location);
        } 
        else {
            return null;
        }
       
    }
    else {
        return null;
    }
}
    

    private PuzzleState trySlide2(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(2);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide3(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(3);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }    
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide4(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(4);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide5(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(5);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow() ) && tiles.getColumn() == blank.getColumn()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide6(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(6);
        PuzzleState.Location blank = state.getLocation(0);
       
        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide7(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(7);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }

    private PuzzleState trySlide8(PuzzleState state) {

        PuzzleState.Location tiles = state.getLocation(8);
        PuzzleState.Location blank = state.getLocation(0);

        if((tiles.getRow() >= 0 && tiles.getRow() <= 3) && (tiles.getColumn() >= 0 && tiles.getColumn() <= 3 )
        && (blank.getRow() >= 0 && blank.getRow() <= 3) && (blank.getColumn() >= 0 && blank.getColumn() <= 3 ) ){
            if ((tiles.getRow() + 1 == blank.getRow()) && (tiles.getColumn() == blank.getColumn())) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() + 1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            }
            else if(tiles.getRow()-1 == blank.getRow() && tiles.getColumn()==blank.getColumn()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow() -1, tiles.getColumn());
                return new PuzzleState(state, tiles, location);
            } 
            else if (tiles.getColumn() + 1 == blank.getColumn() && tiles.getRow() == blank.getRow()) {
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn() + 1);
                return new PuzzleState(state, tiles, location);
            } 
            else if(tiles.getColumn()-1 == blank.getColumn() && tiles.getRow() == blank.getRow()){
                PuzzleState.Location location = new PuzzleState.Location(tiles.getRow(), tiles.getColumn()-1);
                return new PuzzleState(state, tiles, location);
            } 
            else {
                return null;
            }
       
        }
        else {
            return null;
        }
    }
}