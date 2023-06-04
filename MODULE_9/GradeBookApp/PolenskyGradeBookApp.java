/*
 * Assignment 10.2 - CIS 505 - Jason Polensky 29May2023
 * 
 *  Student Gradebook App Demo For EdX
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
//  Capstone Project Requirements
// 1.  Name the project folder GradeBookApp.
// 2.  Name the program file YourLastNameGradeBookApp.java.
// 3.  Use GitHub to store the project.
// 4.  Provide users with a grade book form. Include the following fields: first name, last name, course, and grade (use A-F). For the grade field use a ComboBox with prefilled values.
// 5.  Use labels to identify the forms fields.
// 6.  Provide users with a button to clear the grade book form.
// 7.  Provide users with a button to view saved grade entries.
// 8.  Provide users with a button to save a grade book entry.
// 9.  On form submission, write the entered values to a csv file named grades.csv. The grades.csv file should have a header row with values for “firstName, lastName, course, and grade.”
// 10. When a user selects the “view grades’ button, display the contents of the grades.csv file.
// 11. Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade). Name the class Student and include private variables for the fields with two constructors: a default constructor and a parameterized constructor with the class’s properties. Add getter/setter methods for the class properties and Override the toString() method.
// 12. Use the Student classes toString() method to output the object to the results section of the GUI you create.

 
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
import java.text.SimpleDateFormat;
import java.util.stream.*;
public class PolenskyGradeBookApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

private TextField txtFirstName = new TextField();
private TextField txtLastName = new TextField();
private TextField txtCourse = new TextField();
private TextField txtGrade = new TextField();

private TextArea txtResult = new TextArea();
 
private Label lblFirstName = new Label("First Name:");
private Label lblLastName = new Label("Last Name:");
private Label lblCourse = new Label("Course Name:");
private Label lblGrade = new Label("Grade:");
private Label lblStudents = new Label("Students");


private Button btnClear = new Button("Clear");
private Button btnView = new Button("View");
private Button btnSave = new Button("Save");
private ComboBox<String> cboGrades = new ComboBox<>();

@Override
public void start(Stage primaryStage){
    cboGrades.getItems().addAll("A","B","C","D","F","Incomplete","Drop","RollToNextClass");
    GridPane pane = new GridPane();//(2*5) 
    pane.setAlignment(Pos.CENTER);  // and set its alignment to Pos.CENTER
    pane.setPadding(new Insets(11.5,12.5,13.5,14.5));// set its padding to 11.5, 12.5, 13.5, and 14.5. 
    pane.setHgap(5.5);//Next, set the panes Hgap to 5.5 
    pane.setVgap(5.5);//and its Vgap to 5.5.
    //row 0 - FirstName
    pane.add(lblFirstName,0,0);
    pane.add(txtFirstName,1,0);
    //row 1 - LastName
    pane.add(lblLastName,0,1);
    pane.add(txtLastName,1,1);
    //row 2 - Course
    pane.add(lblCourse,0,2);
    pane.add(txtCourse,1,2);
    //row 3 - Grade
    pane.add(lblGrade,0,3);
    pane.add(cboGrades,1,3);
    //row 4
    HBox actionBtnContainer = new HBox(); // Create a new HBox container.
    
    btnClear.setOnAction(e -> clearFormFields());
    // btnCalculate.setOnAction(e -> calculateResults());
    actionBtnContainer.setPadding(new Insets(15,0,15,30)); // Set the containers padding.
    actionBtnContainer.setSpacing(10); // Set the containers spacing.
    actionBtnContainer.getChildren().add(btnClear); // Add the btnClear to the container.
    actionBtnContainer.getChildren().add(btnView); // Add the btnCalculate to the container.
    actionBtnContainer.getChildren().add(btnSave); // Add the Save Button to the contatiner
    pane.add(actionBtnContainer, 1, 4); // Add the container to the GridPanel.
    //row 5
    pane.add(lblStudents,0,5);
    //row 6
    pane.add(txtResult, 0, 6, 2, 1);
    //    f. Set the primary stages title to “YourLastName Future Value App.”
Scene scene = new Scene(pane);
primaryStage.setTitle("Polensky Gradebook App");
primaryStage.setScene(scene);
primaryStage.show();

    }

    private void clearFormFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtCourse.setText("");
        txtGrade.setText("");
    }
 

}  // End PolenskyGradebookApp class
