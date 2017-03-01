/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.ui.ProblemConsole;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tyler
 */
public class FarmerConsole extends Application{
    
    public void start(Stage primaryStage){
        Scene scene = new Scene(new ProblemConsole(new FarmerProblem(), 450, 550));
        primaryStage.setTitle("Hamzas Arithmetic Console");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
}
