




package Methods;

public class Method {
  
    // Methods
    static void printOut(){
        System.out.println("Print out method has been called out successfully.");
    }
    // Method with params
    static void parameterMethods( String firstName, int level ){
        System.out.println("The family of Sents the " + level + "rd has " + firstName );
    }


    // Methods with return values
    static int retMethods(int hrs, int mins ){


        return hrs;
    }
    public static void main( String[]args){
        printOut();
        // calling methods with params
        parameterMethods("Deco", 3);

        // calling methods with return

        retMethods(6, 32);
    }
}
