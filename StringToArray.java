




public class StringToArray{

    public void thisMethod(){

        String greet = "Salamu";

        char[] greetArray = greet.toCharArray();
        System.out.println(greetArray);
    }


    public static void main(String[] args){

        StringToArray methodObj = new StringToArray();
        methodObj.thisMethod();


        System.out.println("end_____");
    }
}