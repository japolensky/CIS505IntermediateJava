/*
 * Assignment 8.2 - CIS 505 - Jason Polensky 29May2023
 * 
 *  Enhanced Future Value Calculation Applications
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
/*
 *    Instructions for Assignment 8.2
// 1. Add a new folder under your cis-505 folder and name it Module_8. ***Done
// 2. Make a copy of the Java file you created in Module 7 and rename it YourLastNameEnhancedFutureValueApp.java. ***Done
// 3. Add a new file to the Module_8 folder and name it FinanceCalculator.java. ***Done
//    Additional Java Programming Requirements
*/


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

import java.util.Date;



public class PolenskyEnhancedFutureValueApp extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

private TextField txtPayment = new TextField();
private TextField txtRate = new TextField();

private TextArea txtResult = new TextArea();
 
private Label lblMonthlyPayment = new Label("Monthly Payment:");
private Label lblInterestRate = new Label("Interest Rate:");
private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
private Label lblYears = new Label("Years:");
private Label lblfifth = new Label("");

private ComboBox<Integer> cboYears = new ComboBox<>();

private Button btnClear = new Button("Clear");
private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage){

GridPane pane = new GridPane();//(2*5) 
pane.setAlignment(Pos.CENTER);  // and set its alignment to Pos.CENTER
pane.setPadding(new Insets(11.5,12.5,13.5,14.5));// set its padding to 11.5, 12.5, 13.5, and 14.5. 
pane.setHgap(5.5);//Next, set the panes Hgap to 5.5 
pane.setVgap(5.5);//and its Vgap to 5.5.
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
 // 2. YourLastNameEnhancedFutureValueApp.java
//    Additional Java Programming Requirements
//   a. Create a private method named clearFormFields() with a return type of void. Set the txtMonthlyPayment, txtInterestRate, txtResults, and lblFutureValueDate text values to an empty string. Set the cbYears value to 0.

//   b. Create a private method named calculateResults that collects the users entered values and calls the calculateFutureValue method from the FinanceCalculator class. Set the lblFutureValueDate text to the string value “Calculation as of <today’s date>” and set the txtResults TextArea to the string value “The future value is <futureValue>”
//    Exhibit C EnhancedFutureValueApp results

//   c. Add a private String method that returns today’s date with the following format “MM/dd/yyyy.” 
//    The easiest way to do this is use the SimpleDateFormat object and pass-in the string pattern “MM/dd/yyyy.” 
//    Next, call the format() method off of the SimpleDateFormat object and pass-in a new Date() instance. The return value from this method will be used to show today’s date in the “Calculation as of <today’s date>” label.
//  Additional Java Programming Help
//      • Set the private methods to the onAction of the buttons
//          o btnClear event: btnClear.setOnAction(e -> clearFormFields());
//          o btnCalculate event: btnCalculate(e -> calculateResults());
}  // End PolenskyFutureValueApp class
