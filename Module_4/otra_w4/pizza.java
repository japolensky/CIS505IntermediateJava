package Module_4.otra_w4;

public class pizza {
    static String yum="Cheese and Pepperoni";
  void pie(String p){System.out.println("Dominos");}
  void pie(String p, String q){System.out.println("Pizza Pizza - Little Cesears");}  
  void pie(Integer i){System.out.println("Little Cesars - Hot and Ready is only $5");}
        public static void main(String[] args) {
            pizza a= new pizza();
            pizza b= new pizza();
            pizza c= new pizza();
        
        a.pie("thin");
        b.pie("cheap","quick");
        c.pie(5);
        }
}
