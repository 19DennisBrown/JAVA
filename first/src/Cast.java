

public class Cast{
    public static void main(String [] args){
        // Type casting is when you assign a value of one primitive data type to another type.

        //A. Widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        
        System.out.println(myInt);     
        System.out.println(myDouble);   
        //A. Narrowing casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble2);   
        System.out.println(myInt2);   
        
        
        // REAL LIFE EXAMPLE
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}