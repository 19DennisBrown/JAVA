



public class Arrays {
    public static void main( String[]args){

        int[] numbers = {10, 20, 30, 40};
        // Change index content.
        numbers[0] = 11;

        // length
        int len = numbers.length;

        // Looping through.
        
        for( int j : numbers){
            System.out.println(j);
        }
        System.out.println(numbers[2]);

        // TWO-DIMENSIONAL
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);

        // Real example

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int lowestAge = ages[0];

        for( int age : ages ){
            if( lowestAge > age ){
                lowestAge = age;
            }

        };
        System.out.println(" Lowesst age is : " + lowestAge);

        System.out.println(" End of code. ");
    }
}


