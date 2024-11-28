


public class AccessMethods {
    
   public void carSpeed( int speed){

   
    System.out.println( "The car is cruising at : " + speed);
   }

   public void  fullThrottle(){

    System.out.println(" It is not at full throttle.");
   }

   public static void main( String[]args){

    AccessMethods myCar  = new AccessMethods();
    myCar.carSpeed(39);
    myCar.fullThrottle();


    System.out.println();
   }
}





