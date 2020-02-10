/*
 * Kyle Brown
 * Project 16.3
 * Traffic lights
 * This program displays a traffic light, with radio buttons that control which
 * light is displayed.
 */
package exercise16_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Exercise16_3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        Pane root = new MainPane(500, 500);
        
        
        primaryStage.setTitle("16.3 Traffic Lights");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public class MainPane extends Pane{
        private double width;
        private double height;
        
        
        public MainPane (double w, double h){
        width = w;
        height = h;
        
        setPrefWidth(width);
        setPrefHeight(height);
        
        Rectangle box = new Rectangle (width / 3, height / 6, width / 3, 
        height / 1.5);
        box.setFill(Color.TRANSPARENT);
        box.setStroke(Color.BLACK);
        
        Circle greenCircle = new Circle(width / 2, height * 2/3, width * .08);
        Circle yellowCircle = new Circle(width / 2, height /2, width * .08);
        Circle redCircle = new Circle(width / 2, height /3, width * .08);
        greenCircle.setFill(Color.TRANSPARENT);
        greenCircle.setStroke(Color.BLACK);
        
        
        yellowCircle.setFill(Color.TRANSPARENT);
        yellowCircle.setStroke(Color.BLACK);
        
        
        redCircle.setFill(Color.TRANSPARENT);
        redCircle.setStroke(Color.BLACK);
        
        
        RadioButton greenBtn = new RadioButton("Green");
        RadioButton yellowBtn = new RadioButton("Yellow");
        RadioButton redBtn = new RadioButton("Red");
        
        greenBtn.setOnAction(e -> {
            if (greenBtn.isSelected()) {
                greenCircle.setFill(Color.GREEN);
                yellowCircle.setFill(Color.TRANSPARENT);
                redCircle.setFill(Color.TRANSPARENT);
            }
        });
        
        yellowBtn.setOnAction(e -> {
            if (yellowBtn.isSelected()) {
                greenCircle.setFill(Color.TRANSPARENT);
                yellowCircle.setFill(Color.YELLOW);
                redCircle.setFill(Color.TRANSPARENT);
            }
        });
        redBtn.setOnAction(e -> {
            if (redBtn.isSelected()) {
                greenCircle.setFill(Color.TRANSPARENT);
                yellowCircle.setFill(Color.TRANSPARENT);
                redCircle.setFill(Color.RED);
            }
        });
        
        ToggleGroup btns = new ToggleGroup();
        greenBtn.setToggleGroup(btns);
        yellowBtn.setToggleGroup(btns);
        redBtn.setToggleGroup(btns);
        HBox radioButtonPane = new HBox(10);
        radioButtonPane.getChildren().addAll(greenBtn, yellowBtn, redBtn);
        getChildren().addAll(box, radioButtonPane);
        getChildren().addAll(greenCircle, redCircle, yellowCircle);
    }
        

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
