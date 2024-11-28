



public class WhileLoop {
    public static void main( String [] args){

        // WHILE LOOP
        int time = 1;
        while( time < 5){
            System.out.println(time);
            time++;
        }

        // DO WHILE LOOP
        int teams = 3;
        do{
            System.out.println(teams);
            teams++;
        }
        while(teams <= 5);

        // EXAMPLE
        int dice = 1;

        while (dice <= 6) {
        if (dice <= 3) {
            System.out.println("No way.");
        } else {
            System.out.println("YEs way!");
        }
        dice++;
        }

        System.out.println("End of code. ");
    }
}

