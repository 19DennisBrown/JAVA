


public class ClassMethods {
    

    //Public method, can only be accessed via methods;
    public void thatMethod(){
        System.out.println(" This a public method.");
    }

    // Static method;
    static void thisMethod(){
        System.out.println("This is a static method.");
    }

    public static void main( String[]args){


        ClassMethods obj = new ClassMethods();
        obj.thatMethod(); //Calling a public method;


        thisMethod(); //Calling  a static method;
        System.out.println(" End of code.");
    }
}







