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
static Double calculateFutureValue(Double monthlyPayment, Double rate, int years) {    
    // c. In the body of the method calculate the moths by taking the argument years and multiplying it by the MONTHS_IN_YEAR variable.
    System.out.println("Into calculateFutureValue() Payment: "+monthlyPayment+" Rate:"+rate+" Years:"+years);
    int months = MONTHS_IN_YEAR * years;
    // d. Calculate the interest rate by using the formula in Exhibit A.
    //    Exhibit A: (1 + rate / 100)
    // https://keisan.casio.com/exec/system/1234231998
    double r = (rate/100/MONTHS_IN_YEAR); // seems like the rate was incorrect in the program specification - corrected to monthly rate.
  
    // https://www.youtube.com/watch?v=8orMdeSDDPE
    // e. Calculate the presentValue by multiplying the monthlyPayment by the number of months variable.
    Double presentValue = monthlyPayment * months;
    // f. Calculate the futureValue by using the calculation in Exhibit B.
    //    Exhibit B: presentValue * (Math.pow(interestRate, months)
    // Double futureValue = presentValue * (Math.pow(rate, months)); // this gives a wrong answer...me no like found better function to match the typical excel function
    double futureValue=fv(r,months,monthlyPayment,0,1);// preset pv-initial value to zero for the program strategy, type 1 at beginning payment
    System.out.println("rate:"+r+" present value:"+presentValue+" Months:"+months);
    System.out.println("Future Value:"+futureValue);
    //    a. Return the calculated futureValue
    return futureValue;
} // end of calculateFutureValue method
// http://www.devnips.com/2017/02/microsoft-excel-fv-function-in-java.html
// https://poi.apache.org/apidocs/dev/org/apache/poi/ss/formula/functions/FinanceLib.html
static public double fv(double r, int nper, double pmt, double pv, int type) { 
    double fv=0;
    //   p(1+r)^n + y(1+rt)((1+r)^n-1)/r + f=0   ...{when r!=0} 
    if (r!=0){fv = (pv * Math.pow(1 + r, nper) + pmt * (1 + r * type) * (Math.pow(1 + r, nper) - 1) / r); }
    if (r==0){fv=(pmt*nper);}
    //   ny + p + f=0                            ...{when r=0} 
    return fv;
}
}
