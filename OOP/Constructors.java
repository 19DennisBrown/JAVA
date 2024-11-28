
public class Constructors{

    int currentYear;
    String currentLeader;

    public Constructors(int year, String leader){//contructor with parameters

        currentYear = year;
        currentLeader = leader;
    }

    public static void main(String[] args) {
        
        Constructors newObj = new Constructors( 2022, "Kamhole");
        System.out.println("In the year of "+ newObj.currentYear + " the leader is " + newObj.currentLeader);
    }
}