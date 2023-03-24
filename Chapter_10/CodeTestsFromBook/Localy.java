package Chapter_10.CodeTestsFromBook;

public class Localy{
private static int i=4;  //static for all objects
private int j=4; //instance
public static void main(String[] args) {
Localy lee = new Localy();
Localy fry = new Localy();
Localy leela = new Localy();

leela.i=5;//static affects every object
leela.j=5;//instance affects just the object

System.out.println("Class i (accessed as lee.i)="+lee.i);
System.out.println("Class i (accessed as fry.i)="+fry.i);
System.out.println("Class i (accessed as leela.i)="+leela.i);//improper for static

System.out.println("Class j (accessed as lee.j)="+lee.j);
System.out.println("Class j (accessed as fry.j)="+fry.j);
System.out.println("Class j (accessed as leela.j)="+leela.j);

    System.out.println("Class i (accessed as just i)="+i);
    for (int i=1;i<10;i++){
        System.out.println("i local = "+i);
    }
}
}