


public class ifElse {
    public static void main( String[] args){

        int time = 22;
        if (time < 10) {
        System.out.println("Good morning.");

        } else if (time < 18) {
        System.out.println("Good day.");

        } else {
        System.out.println("Good evening.");

        }

        // Short-hand
        int date = 20;
        String result = (date < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int experience = 12;
        String dev = (experience > 12) ? "Senior" : "Junior";
        System.out.println(dev);

        //Complex example.
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
        System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
        System.out.println("The value is a negative number.");
        } else {
        System.out.println("The value is 0.");
        }

        System.out.println("The end");
    }
}
