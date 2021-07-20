package Programs.OOPs;
// Java Program to illustrate run-time polymorphism

// Base Class
class Biker {
       public int gear;
       public int speed;

       Biker(int gear,int speed){
             this.gear = gear;
             this.speed = speed; 
        }

        // I
        public void speedUp(int increment){
             speed += increment;

        }

        //I
        public void applyBrake(int decrement){
             speed -= decrement;
        }
        
        //III
        public String printInfo(){
             return("No of gears are :"+gear+"\n"+"Speed of the bike is :"+speed+"\n");
        }
  
    }
    //Child class
    class Mountainbiker extends Biker
    {
        public int seatHeight;

        Mountainbiker(int gear, int speed, int seatHeight) {

            super(gear, speed);
            this.seatHeight = seatHeight;
        }
        
        // II
        public void seatHeight(int newValue){
            seatHeight = newValue;
        }

        // III
        @Override
        public String printInfo(){
            return(super.printInfo()+"The seat height is :" + seatHeight);
        }
    static class Test{
       public static void main (String[] args){
           //MountainBiker obj = new Biker(3,100) this creates an error as instance in the heap memory can't be referrenced to child class
           // Mountainbiker obj = new Mountainbiker(3,100,25);  I , II and overridden III
           Biker obj  = new Mountainbiker(3,100,20); //I and Overridden III only child class method i.e. obj.seatHeight will not be accessible here
          // Biker obj       = new Biker(3,100);   I and  original  III methods
          
           obj.speedUp(20);
           obj.applyBrake(5);
           // obj.seatHeight(15); 
           
           System.out.println(obj.printInfo());
       } 
    }        
}


       

  

