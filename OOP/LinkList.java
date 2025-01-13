

import java.util.LinkedList;

public class LinkList{


    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.addLast("Toyota");
        cars.addFirst("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Removing the first item in the list.
        cars.removeFirst();

        // Retrieving the first item:
        String firstItem = cars.getFirst();


        for(int n = 0; n<cars.size() ; n++){
            System.out.println(cars.get(n));
        }
        System.out.println("This is the first item in the linked list: "+ firstItem);
        System.out.println("The end______________________");
    }
}