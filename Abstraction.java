


abstract class People{

    public abstract String walkingStyle();

    public void population(){

        System.out.println("Everywhere on earth.");
    }
}

class Men extends  People{
    public String walkingStyle(){
        return "Unique";
    }

}



public class Abstraction{
    public static void main(String[] args){

        Men menObj = new Men();
        menObj.walkingStyle();
        menObj.population();

        System.out.println("__End__");
    }
}
