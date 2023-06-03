/* Polensky, Jason (2023)  Future Value Calculator Implementation _ FinanceCalculator.java - 
*       adding methods for use by the PolenskyEnghancedFutureVAlueApp.java 
*/
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment8.2.pdf
 */
public class FinanceCalculator {
    private static int MONTHS_IN_YEAR=12;// a. Add a private static int with the name MONTHS_IN_YEAR and give it a default value of 12.  
// b. Create a static double method named calculateFutureValue with three parameters: double monthlyPayment, double rate, and int years.
static double calculateFutureValue(double monthlyPayment, double rate, int years) {    
    // c. In the body of the method calculate the moths by taking the argument years and multiplying it by the MONTHS_IN_YEAR variable.
    int months = MONTHS_IN_YEAR * years;
    // d. Calculate the interest rate by using the formula in Exhibit A.
    //    Exhibit A: (1 + rate / 100)
    rate = (1+rate)/100;
    // e. Calculate the presentValue by multiplying the monthlyPayment by the number of months variable.
    double presentValue = monthlyPayment * months;
    // f. Calculate the futureValue by using the calculation in Exhibit B.
    //    Exhibit B: presentValue * (Math.pow(interestRate, months)
    double futureValue = presentValue * Math.pow(rate, months);
    //    a. Return the calculated futureValue
    return futureValue;
    } // end of calculateFutureValue method
}
