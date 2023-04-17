package MODULE_5.OtherThingsForWeek5;
import java.util.Set;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* 
* Stack overflow common question
https://stackoverflow.com/questions/72572432/formatting-currency-with-java8-and-java-11 
 */

 /* Currency Code List - ISO4217 - because who really sticks with one currency?
  * https://www.six-group.com/en/products-services/financial-information/data-standards.html
  * https://www.six-group.com/dam/download/financial-information/data-center/cfi/cfi-20210507-current.xlsx
  * https://www.six-group.com/dam/download/financial-information/data-center/iso-currrency/lists/list-one.xml
  */
public class FormatCurrencyTesting {
    public static void main(String[] args) {
        Double amount=10.004;// money
        Currency currencyCanadian = Currency.getInstance("CAD"); // Canadian Dollars
        Currency currencyUSD = Currency.getInstance("USD");  // United States Dollars
        Currency currencyTHAI = Currency.getInstance("THB");  // Thai Baht
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setCurrency(currencyCanadian);
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        // dfs.setCurrencySymbol("CAD");
        ((DecimalFormat) formatter).setDecimalFormatSymbols(dfs);
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);
        System.out.println(" " + formatter.format(10.005)) ;
        formatter.setCurrency(currencyUSD);
        System.out.println(" " + formatter.format(10.005)) ;
        formatter.setCurrency(Currency.getInstance(Locale.CHINA));  // this seems to work the best
        System.out.println(" " + formatter.format(10.005)) ;
        formatter.setCurrency(Currency.getInstance(Locale.getDefault()));  // this seems to get the user default
        System.out.println(" " + formatter.format(10.005)) ;

        formatter.setCurrency(Currency.getInstance(Locale.US));  // this seems to get the user default
        System.out.println(" " + formatter.format(10.005)) ;
//trying for single line
System.out.println("Single line straetegy");

        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount));

        Set<Currency> set = Currency.getAvailableCurrencies();
        //set.forEach(c -> System.out.println(c)); 
        System.out.println(set);
        set.forEach(c -> System.out.println(c.getNumericCode()+" "+c+" "+c.getDisplayName())); 


    }
    
}
