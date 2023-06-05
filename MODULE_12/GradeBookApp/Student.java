/*
 * Assignment 12.2 - CIS 505 - Jason Polensky 29May2023
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
// 11. Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade). Name the class Student and include private variables for the fields with two constructors: a default constructor and a parameterized constructor with the class’s properties. Add getter/setter methods for the class properties and Override the toString() method.
public class Student {
    private String firstName;
    private String lastName;
    private String course;
    private String grade;
    
    public Student( String firstName, String lastName, String course, String grade){ // constructor
        this.firstName=firstName;
        this.lastName=lastName;
        this.course=course;
        this.grade=grade;
    } // end Student constructor
//accessors
public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCourse() {
        return course;
    }
    public String getGrade() {
        return grade;
    }
    //mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
    // 12. Use the Student classes toString() method to output the object to the results section of the GUI you create.
    // return a string with the class data
    return "Name: "+firstName+" "+lastName+" "+"Course: "+course+" Grade:"+grade;
    }

}
