/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
        Additional modifications by Jason Polensky 26March2023
    
    Kaplan, D (2023) Smple ANSI color class for terminal coder for JVM
          https://gist.github.com/dainkaplan/4651352

    my solution is below: The 10.10.8 failure case made to run without having 
    null objects / exception, also incorporates 'this' concept for construction
    and access.
*/ 
package Chapter_10.CodeTestsFromBook;


public class Book10_10_8 {  
    
        private String ctext;
        public  String cpublictext;
        public Book10_10_8() {
          this("\u001B[5m Second Object! \u001B[0m");}
        public Book10_10_8(String ins) {
          String otext;
          System.out.println("Instantiating ojbect with variable "+ins);
          otext = ins;
          this.ctext= ins;
          this.cpublictext = ins;
          System.out.println("\u001B[35m within object construction private ctext=\u001B[30m"+this.ctext);
          System.out.println("\u001B[35m cpublictext=\u001B[30m"+this.cpublictext);
          System.out.println("\u001B[35m object text=\u001B[30m"+otext+"\u001B[0m");
        }   
        public static void main(String[] args) {
          // test constructor with text input
          System.out.println("\u001B[7m Starting! \t\u001B[0m");
          String txt1="First Object!";     
      Book10_10_8 test = new Book10_10_8(txt1);
          // evaluate object that was created
        System.out.println("\u001B[31m Evaluating test1 object from main:");
        System.out.println("\u001B[35m \tprivate test.ctext=\u001B[37m"+test.ctext);
        System.out.println("\u001B[35m \ttext.cpublictext=\u001B[37m"+test.cpublictext);
        System.out.println("\u001B[35m \ttest.ctext=\u001B[37m"+test.ctext+"\u001B[0m");

        System.out.println("\u001B[7m\u001B[35mNext Object \u001B[0m");
        // test arguement free construtor
      Book10_10_8 test2 = new Book10_10_8();
          //evaluate created object
        System.out.println("\u001B[31m Evaluating test2 object from main:");
        System.out.println("\u001B[35m \tprivate test2.ctext=\u001B[0m"+test2.ctext);
        System.out.println("\u001B[35m \ttest2.cpublictext=\u001B[0m\u001B[2m"+test2.cpublictext);
        System.out.println("\u001B[35m \ttest2.ctext=\u001B[0m\u001B[1m"+test2.ctext+"\u001B[0m");
        //finito
        System.out.println("\u001B[7m Finish! \u001B[0m");
        }  
}
