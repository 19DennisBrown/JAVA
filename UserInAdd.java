

import java.util.Scanner;


public class UserInAdd {
    
    public void userIn(){
        Scanner  getData  = new Scanner(System.in);
        System.out.println("Enter first number: _____");
        int first = getData.nextInt();
        System.out.println("Enter second number: _____");
        int second = getData.nextInt();

        int sum = first + second;
        System.out.println("The sum of the inputs is : "+sum);
    }

    public static void main(String[] args){

        UserInAdd userObj = new UserInAdd();
        userObj.userIn();

        System.out.println("End________________");
    }
}










