


public class Overloading {
    static int plusMethod(int x, int y) {
        return x + y;
      }
      
    static double plusMethod(double x, double y) {
    return x + y;
    }

    static String person( String title){
        return title;
    }
    static int person( int age){
        return age;
    }
    
    
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        String tt = person("Dennis");
        int gg = person(12);
        System.out.println( tt + " is " + gg + " years old.");

    }

}
