/*
 * Assignment 7.2 - CIS 505 - Jason Polensky 29May2023
 * 
 *  Future Value Calculation Applications
 */
/*
 *   Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 *       Comprehensive Version (12th ed.). Pearson Education, Inc.
 */ 
/*
 *   Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
 *       Instructions for Assignment3.1.pdf
 */
/*
 * Working with JavaFX
 */


// 1. Download and install the JavaFX SDK. - i ended up using java 8 / 1.8, could not get JavaFX 17 or 20 to work with vscode.
// 2. Add a new folder to your cis-505 repository and name it FutureValueApp. - done
// 3. Add a new file to the FutureValueApp folder and name it YourLastNameFutureValueApp.java. - here it is 

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// 4. Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object.
public class PolenskyFutureValueApp extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }
// 5. Create private variables for two TextField’s 
private TextField txtPayment = new TextField();
private TextField txtRate = new TextField();
//one TextArea 
private TextArea txtResult = new TextArea();
//five Labels  
//       Additional Java Programming Requirements
//    a. Set the text for the labels to match the labels in Exhibit A.
//       Exhibit C Labels with a default text value 
private Label lblMonthlyPayment = new Label("Monthly Payment:");
private Label lblInterestRate = new Label("Interest Rate:");
private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
private Label lblYears = new Label("Years:");
private Label lblfifth = new Label("");
//one ComboBox of type Integer 
private ComboBox<Integer> cboYears = new ComboBox<>();
//and two Button’s.
//    b. Set the text for the buttons to match the buttons in Exhibit A.
//       Exhibit D Buttons with a default text value
private Button btnClear = new Button("Clear");
private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage){
//    c. In the start() method, add a new GridPane object
GridPane pane = new GridPane();//(2*5) 
pane.setAlignment(Pos.CENTER);  // and set its alignment to Pos.CENTER
pane.setPadding(new Insets(11.5,12.5,13.5,14.5));// set its padding to 11.5, 12.5, 13.5, and 14.5. 
pane.setHgap(5.5);//Next, set the panes Hgap to 5.5 
pane.setVgap(5.5);//and its Vgap to 5.5.

//    d. Add the controls to the GridPane. 
//row 0 - Monthly Payment / Payment Value
pane.add(lblMonthlyPayment,0,0);
pane.add(txtPayment,1,0);
//row 1 - Interest Rate / Interest Value
pane.add(lblInterestRate,1,1);
pane.add(txtRate,1,1);
//row 2 - lbl Interest entry advice
lblInterestRateFormat.setTextFill(Color.RED);//For the lblInterestRateFormat label
GridPane.setHalignment(lblInterestRateFormat,HPos.RIGHT);//set the text fill to red and HPos to the right.
pane.add(lblInterestRateFormat,1,2);
//row 3
pane.add(lblYears,0,3);
pane.add(cboYears,1,3);
//row 4
HBox actionBtnContainer = new HBox(); // Create a new HBox container.
    //    e. Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
    //       Exhibit F actionBtnContainer
actionBtnContainer.setPadding(new Insets(15,0,15,30)); // Set the containers padding.
actionBtnContainer.setSpacing(10); // Set the containers spacing.
actionBtnContainer.getChildren().add(btnClear); // Add the btnClear to the container.
actionBtnContainer.getChildren().add(btnCalculate); // Add the btnCalculate to the container.
pane.add(actionBtnContainer, 1, 4); // Add the container to the GridPanel.
//row 5
pane.add(txtResult, 0, 5, 2, 1);
//    f. Set the primary stages title to “YourLastName Future Value App.”
Scene scene = new Scene(pane);
primaryStage.setTitle("Polensky Future Value App");
primaryStage.setScene(scene);
primaryStage.show();
    }
}  // End PolenskyFutureValueApp class
