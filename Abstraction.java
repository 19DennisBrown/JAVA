


abstract class People{

    public abstract void walkingStyle();

    public void population(){
        
        System.out.println("Everywhere on earth.");
    }
}

class Men extends  People{
    public void walkingStyle(){
        System.out.println("Unique.");
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
