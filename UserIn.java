
import java.util.Scanner;


public class UserIn{

    public static void main(String[] args){
        Scanner enterObj = new Scanner(System.in);

        System.out.println("Enter a fav number and the reason : __");

        int favNum = enterObj.nextInt();
        String reason = enterObj.nextLine();
        
        System.out.println(favNum + " is the "+ reason +" number.");

        System.out.println("__end__.");
    }
}