


import java.util.ArrayList;
import java.util.Collections;

public class ArraysList{



    public static void main(String[] args){

        ArrayList<String> candidates = new ArrayList<String>();

        // Adding an item
        candidates.add("a");
        candidates.add("aa");
        candidates.add("aba");
        candidates.add("abb");
        candidates.add("bba");
        candidates.add("bbb");

        // Accessing an item.
        candidates.get(0);

        // change an item.
        candidates.set(1, "bb");

        // Removing an item.
        candidates.remove(2);

        // Remove all
        // candidates.clear();

        // Get the size.
        candidates.size();

        // Looping through an array.
        for( int n = 0; n < candidates.size(); n++){
            System.out.println(candidates.get(n));
        }


        System.out.println(candidates);
        System.out.println("_________________");



        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(021);
        ages.add(03);
        ages.add(014);
        ages.add(05);


        for(int g : ages){
            System.out.println(g);
        }

        // Sorting ages array.
        Collections.sort(ages);
        System.out.println(ages);
        System.out.println("__end__");
    }
}