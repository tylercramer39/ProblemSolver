/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.ui.ProblemGUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Tyler
 */
public class FarmerGUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new ProblemGUI(new FarmerProblem(), 800, 750));
        primaryStage.setTitle("Testing FWGC GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
