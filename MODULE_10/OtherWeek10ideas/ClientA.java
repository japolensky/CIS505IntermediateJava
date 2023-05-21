package MODULE_10.OtherWeek10ideas;
// Long Nguyen presented the idea from 
// https://www.codejava.net/coding/what-is-dependency-injection-with-java-code-example
// https://github.com/namhaminh/namhaminh <-No code here, all in Udemy
// https://www.udemy.com/user/namhaminh/  <-only Udemy students get access to his codebase
// https://www.youtube.com/watch?v=ZCjwQ608jjU <-Code example presented here - non runnable
// Modified by Jason Polensky during CIS505_Java Intermediate Programming at Bellevue University (2023) from Nam Ha Minh's YouTube example.

public class ClientA{
        String a = "Information from Client A";
        ServiceB service = new ServiceB();
         
        public String doSomething() {    
            return service.getInfo();
        }
        public static void main(String[] args) {
            ClientA eh = new ClientA();
            System.out.println("  client access:  "+eh.a); //use the Client directly for variable access
            System.out.println("  client access:  "+eh.doSomething()); // use the Client directly - use the client in loose coupling strategy.
            System.out.println("  service access: "+ServiceB.getInfo());// use the service directly for function access - create an unfortunate/unneccessary tight coupling
            System.out.println("  service access: "+eh.service.bee); // use the service directly for variable access - create tight coupling underpinning
        }
        public class ServiceB {
            public String bee = "I'm one of the Service Bees.";
            public static String getInfo() {
                return "Information from Service B - returned from getInfo()";
            }
        }
}

