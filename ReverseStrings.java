
import java.util.Scanner;

public class ReverseStrings{
    
    public void getString(String origi){
        
        String revert = "";

        for( int i = 0; i < origi.length(); i++){

            revert = origi.charAt(i) + revert;
            if( revert.length() == origi.length()){

                System.out.println(revert);
            } 
        }
        
    }


    public static void main(String[] args){
        
        // String origi = "Home";
        
        
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the word to reverse: __");
        String text = inputObj.nextLine();
        
        ReverseStrings methodObj = new ReverseStrings();
        methodObj.getString(text);

        System.out.println("end_____");
    }
}