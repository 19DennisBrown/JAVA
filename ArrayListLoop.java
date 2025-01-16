import java.util.ArrayList;

public class ArrayListLoop{

    public void thisFunc(){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        for (String c : cars) {
            System.out.println("-"+ c);
        }
    } 

    public static void main(String[] args){

        ArrayListLoop funcMethod = new ArrayListLoop();
        

        funcMethod.thisFunc();

        System.out.println("end-__-");
    }
}