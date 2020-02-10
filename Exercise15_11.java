/*
 * Kyle Brown
 * Project 15.11
 * Move a Circle Using Keys
 * This program moves a circle up, down, left, or right, using the arrow keys
 */
package exercise15_11;
//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise15_11 extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        //creates the circle
        Circle circle = new Circle(150, 125, 30);
        
        //creates the pane and adds the circle
        Pane root = new Pane();
        root.getChildren().add(circle);
        
        //key event
        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                //reads what the user inputs, and moves the circle accordingly
                case DOWN: circle.setCenterY(circle.getCenterY() + 10.0); break;
                case UP: circle.setCenterY(circle.getCenterY() - 10.0); break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10.0); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10.0); break;
            }
        });
        //creates the scene and title, and displays them
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Exercise 15.11");
        primaryStage.setScene(scene);
        primaryStage.show();
        //requests focus on circle
        circle.requestFocus();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
