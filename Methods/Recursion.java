




package Methods;

public class Recursion {
    

    public static void main( String [] args) {
        int res = sum(5, 10);
        System.out.println(res);
    }

    static int sum( int  val, int max ){

        if( val >= max){
            return val + sum( val, max - 1);
        } else{
            return 0;
        }
        
    }
}
