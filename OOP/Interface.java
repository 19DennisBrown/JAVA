

interface Animal{
    public void title();
    public void location();
}

interface Domestic{
    public void home();
}

class Sheep implements Animal, Domestic{
    // Animal interface.
    public void title(){
        System.out.println("Kameme.");
    }
    public void location(){
        System.out.println("Australian continent.");
    }

    // Domestic interface.
    public void home(){
        System.out.println("Home.");
    }
}


public class Interface{

    public static void main(String[] args){
        Sheep methodObj = new Sheep();
        methodObj.title();
        methodObj.location();

        System.out.println("__end__");
    }
}