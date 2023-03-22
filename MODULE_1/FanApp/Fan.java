/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Additional modifications by Jason Polensky 19March2023
     general idea of The Fan Class exercise
    generic uml diagram can be found from author here:
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/content/EvenNumberedExerciseUMLDiagram.pdf
    author solution can be found here:
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/#solutions
    my solution is below:     
*/ 

package MODULE_1.FanApp;

public class Fan {

 // Four constants named and valued per SR 1.3.1   
        final int STOPPED=0;
        final int SLOW=1;
        final int MEDIUM=2;
        final int FAST=3;
// private class variables per SR 1.3.2-5
        private int FanSpeed; 
        private boolean FanPowerState;
        private double radius;
        private String color;
//Default no arguement constructor for a fan SR 1.3.7
//Defaults are selected to match SR 1.3.2-5
    Fan()   { 
        FanSpeed=1;
        FanPowerState=false;
        radius=6;
        color="white";
            }
//An argrument constructor that creates a fan using the four fields as arguments per SR 1.3.8
    Fan(int fSpeed,Boolean fPower,double fRadius,String fColor){
        setSpeed(fSpeed);
        setFanPower(fPower);
        setFanRadius(fRadius);
        setFanColor(fColor);
    }
// Mutators for class variables
        public void setSpeed(int speed){ //This should set the speed to a logical value
            if (speed<0) {speed=0;System.out.println("Speed impossibly low - Set to Zero");}
            else if (speed>3) {speed=3;System.out.println("Speed to high - Set to merely HIGH");}
            FanSpeed=speed;
            }
        public int getSpeed(){  // This should return the fan speed 0-3
            return FanSpeed; 
            }
        public void setFanPower(Boolean powerstate){ // Turn fan on=true or off=false
            FanPowerState=powerstate;
            }
        public Boolean getFanPower(){ //returns the fan powers tate on=true or off=false
            return FanPowerState;
            }
        public void setFanRadius(double fanradius){
            radius=Math.abs(fanradius);//ensure the radius is positive
            }
        public double getFanRadius(){// returns the fan radius
            return radius;
            }
        public void setFanColor(String fancolor){ //sets the color of the fan
            color=fancolor;
            }
        public String getFanColor(){ //returns the fan color
            return color;
            }
        // override toString method to return fan desription per SR 1.3.9
        // if fan ON return fan speed, color, and radius in a compbined string
        // if fan OFF returns color, radius, and message "fan is off"
        public String toString() {
            if (FanPowerState==true) return "The fan Speed is "+getSpeed()+" and its Color is "+ getFanColor() + ", and its radius is "+getFanRadius()+"!";
            
        else{
            return "The fan Color is "+ getFanColor() + ", and its radius is "+getFanRadius()+ " fan is off.";
            }
            }
        //end of the fan class
        }
    