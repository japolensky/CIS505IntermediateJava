package MODULE_4.otra_w4;
import java.util.ArrayList;

public class utilitarian {
public static void main(String[] args) {
    
ArrayList<String> katzen = new ArrayList<>();
   katzen.add("Hi there I'm the first entry");
   katzen.add("car");
   katzen.add("cars");
   katzen.add("ภาษาไทย");//just checking if it does other languages out of box - ide-ok, shell no-ok
   System.out.println(katzen.iterator());
   katzen.set(0, "Now I'm replacing the first entry");
   katzen.iterator();
        for (int i = 0; i<katzen.size(); i++){
        System.out.println("Element: "+i+". "+katzen.get(i));
        }//end loop
    }//end main
}//end class
