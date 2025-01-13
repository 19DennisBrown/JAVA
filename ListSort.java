



import java.util.ArrayList;
import java.util.Collections;  //collection class

public class ListSort {
    

    public static void main(String[] args){

        ArrayList<String> players = new ArrayList<String>();

        players.add("zPlayer1");
        players.add("bPlayer2");
        players.add("cPlayer3");
        players.add("aPlayer4");
        players.add("rPlayer5");

        Collections.sort(players, Collections.reverseOrder());
        for( String t : players){
            System.out.println(t);
        };

        System.out.println("The end__________________");
    }
}




