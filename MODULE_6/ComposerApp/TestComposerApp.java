package MODULE_6.ComposerApp;
/*
 * (The TestComposerApp class #5). Design a class named TestComposerApp to test the classes Composer and MemComposerDao. The class contains:
 */


//1. Prompt the user with a menu matching figure 5.1.

/*Figure 5.1
  Welcome to the Composer App

  MENU OPTIONS
    1. View Composers
    2. Find Composers
    3. Add Composer
    4. Exit

  Please choose an option:
 */
import java.util.Scanner;

public class TestComposerApp {

public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the Composer App\n");    

    boolean exit = false;
    MemComposerDao memComposerDao = new MemComposerDao();

    do {
        //Show menu
        System.out.print("  MENU OPTIONS \n"+
                         "    1. View Composers\n"+  
                         "    2. Find Composer\n"+
                         "    3. Add Composer\n"+  
                         "    4. Exit\n\n"+
                         "  Please choose an option: ");
        
        String choice = s.next();
        switch(choice) {

            case "1": // 2. If option one is selected, display a list of composers. Use the MemComposerDao classes findAll method.
            for(Composer composer : memComposerDao.findAll()) {
                System.out.print(composer.toString()+"\n");
            }
            break;
            
            case "2": // 3. If option two is selected, prompt the user to enter an id and display the selected composer object.               
                System.out.print("\n  Enter an id: ");
                Integer id;
                String in = s.next();
                    try {                     
                        id=Integer.parseInt(in);
                        System.out.print("\n\n  --DISPLAYING COMPOSER--\n");

                            if (id!=null){
                        System.out.print(memComposerDao.findBy(id)+"\n");//Use the MemComposerDao classes findBy method.
                            }
                        } catch (Exception e) {
                            System.out.println("\n  Bad ID! \n  Enter a good ID(Integers Only):");
                            break;
                            }
            break;

            case "3": // 4. If option 3 is selected, prompt the user to create a new composer. Use the MemComposerDao classes insert method.
                System.out.print("    Enter an id: ");
                Boolean retry=false;
                Integer cid=1;
                do{
                String cin = s.next();
                    try {
                        retry=false;                     
                        cid=Integer.parseInt(cin);
                        } catch (Exception e) {
                        System.out.print("\n  Bad ID! \n  Enter a good ID(Integers Only):");
                        retry=true;
                            }
                        }while (retry==true);

                System.out.print("    Enter a name: ");
                String newName = s.next();
                System.out.print("    Enter a genre: ");
                String newGenre = s.next();
                System.out.println();
                memComposerDao.insert(new Composer(cid, newName, newGenre));
                break;

            case "4": // choice 4 exit app
                exit = true;
                break;

            // if the selection is not 1,2,3, or 4 - continue
            default:
                System.out.println("\n  Please choose any option from the menu. (1,2,3, or 4)\n");
                break;
        }
    } while(exit==false);
    
    s.close();

} // end main  


}  // end TestComposerApp.java class
