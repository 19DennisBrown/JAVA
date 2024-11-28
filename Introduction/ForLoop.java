



public class ForLoop {
    public static void main( String [] args){

        int cows = 5;
        for( cows = 1; cows <= 5; cows++){
            System.out.println(cows);
        };

        // NESTED FOR LOOP.
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: " + i); 
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); 
            };
        } 

        System.out.println(" End of code. ");
    };
}

