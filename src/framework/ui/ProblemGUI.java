/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.ui;

import framework.problem.Problem;
import framework.solution.SolvingAssistant;
import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/**
 *
 * @author Tyler
 */
public class ProblemGUI extends VBox {

    public ProblemGUI(Problem problem, double width, double height) {
        
        Label welcomeMessage = new Label("Welcome to the " + problem.getName() +" Problem");
        Label introduction = new Label(problem.getIntroduction());
        currState = new Label(problem.getInitialState().toString());
        goalState = new Label(problem.getCurrentState().toString());

        List<String> moves = problem.getMover().getMoveNames();
        welcomeMessage.setFont( BOLD );
        welcomeMessage.setWrapText(true);
        introduction.setFont( MEDIUM );
        introduction.setWrapText(true);
        super.setSpacing( 20 );

        super.setPrefSize(width, height);
        this.setAlignment(Pos.CENTER);
              
        currState.setFont( MEDIUM );
        currState.setBorder( new Border( new BorderStroke( null,BorderStrokeStyle.SOLID,null,BorderStroke.MEDIUM )));
        currState.setPadding( new Insets( 10 ) );
        goalState.setFont( MEDIUM );
        goalState.setBorder( new Border( new BorderStroke( null,BorderStrokeStyle.SOLID,null,BorderStroke.MEDIUM )));
        goalState.setPadding( new Insets( 10 ) );
        
        currBox = makeState(currState, "Current State: " );
        makeList = makeMoves(problem);
        goalBox = makeState(goalState, "Goal State: ");
        
        HBox hBox = new HBox( 5 );
        //VBox vbox = makeMoves();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll( currBox, makeList, goalBox );
        
        super.getChildren().addAll( welcomeMessage, introduction, hBox , makeMessage() );
    }
    
    private VBox makeState( Node state, String header ) {
        VBox vBox = new VBox(5);
        vBox.setAlignment(Pos.CENTER);
        Label title = new Label(header);
        title.setFont( BOLD );
        vBox.getChildren().addAll(title, state);
        return vBox;
    }
    
    /*private VBox makeMiddle(List<String> moves) {
        VBox vBox = new VBox(5);
        int i = 0;
        if (i==0) { move1 = moves.get(0); }
        else if (i==1) { move1 = moves.get(1); }
        else if (i==2) { move1 = moves.get(2); }
        else if (i==3) { move1 = moves.get(3); }
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll( makeButton(move1) );
        ++i;
        return vBox;
    }
    */
    private Button makeButton(String moveName, Problem problem) {
        Button button = new Button(moveName);
        button.setPrefWidth(200);
        button.setOnAction(event -> {
            currMessage = "";
            solvingAssistant.tryMove(moveName);
            if (!solvingAssistant.isMoveLegal()) {
                currMessage = "Illegal move. Try again.";
            } else if (solvingAssistant.isProblemSolved()) {
                currMessage = "You solved the problem. Congratulations.";
            }
            updateDisplay(problem);
        }
        );
        return button;
    }
    
    public final void updateDisplay(Problem problem) {
        if (problem != null) {
            problem.getCurrentState();
        }
        else {
            currState.setText(problem.getCurrentState().toString());           
        }
        moveTitle.setText(String.format("Moves (%d so far):", solvingAssistant.getMoveCount()));
        message.setText(currMessage);
    }

    private VBox makeMoves(Problem problem) {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        moveTitle = new Label();
        moveTitle.setFont(BOLD);
        help = new VBox(10);
        for (String move2 : problem.getMover().getMoveNames()) {
            Button aButton = new Button(move2);
            aButton.setOnAction(e-> 
            { solvingAssistant.tryMove(move2);
            currState.setText(problem.getCurrentState().toString());
            solvingAssistant.getMoveCount();
            });
        vBox.getChildren().add (makeButton(move2,problem));
        }
        makeReset(problem);
        vBox.getChildren().add(makeReset(problem) );
        
        return vBox;
    }

    private Text makeMessage() {
        message = new Text();
        message.setFont(MEDIUM);
        message.setFill(Color.RED);
        return message;
    }

    private Button makeReset(Problem problem) {
        Button b = new Button("Reset");
        b.setOnAction(event -> {
            solvingAssistant.reset();
            currState.setText(problem.getInitialState().toString());
        }
        );
        return b;
    }
    private Label currState;
    private Label goalState;
    private List<String> moves;
    private VBox currBox;
    private VBox makeList;
    private VBox goalBox;
    private VBox help;
    private String move1;
    private Label moveTitle;
    private String currMessage;
    private SolvingAssistant solvingAssistant;
    private Text message;
    private static final Font BOLD = Font.font( "DejaVu Sans Mono", FontWeight.BOLD, 22 );
    private static final Font MEDIUM = Font.font( "DejaVu Sans Mono", FontWeight.MEDIUM, 18 );

}
