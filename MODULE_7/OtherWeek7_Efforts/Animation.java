//package MODULE_7.OtherWeek7_Efforts;
// https://genuinecoder.com/javafx-animation-tutorial/#pathtransition

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class Animation extends Application {
 
  @Override
  public void start(Stage primaryStage) {
    Button btn = new Button("Genuine Coder");
    Group group = new Group(btn);
    Scene scene = new Scene(group, 600, 600);
 
    //Create new path transition
    PathTransition pathTransition = new PathTransition();
    pathTransition.setDuration(Duration.millis(2500));
    //Set node to be animated
    pathTransition.setNode(btn);
    //Rotate button through a circular path locate at (200,200) with radius 50
    pathTransition.setPath(new Circle(200, 200, 50));
 
    pathTransition.play();
 
    primaryStage.setScene(scene);
    primaryStage.show();
  }
 
  public static void main(String[] args) {
    Application.launch(args);
  }
}