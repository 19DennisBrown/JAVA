

class Animal{
    private String kingdom = "Animalia";
    public String getKingdom(){
        return kingdom;
    }
    public void animalSound(){
        System.out.println("Every animal produces a specific sound");
    }
}

class Sheep extends Animal{
    public void animalSound(){
        System.out.println("Mee meeee");
    }
}

class Cow extends  Animal{
    public void animalSound(){
        System.out.println("Mooo mooo");
    }
}




public class Polymorphism {
    
    public static void main(String[] args){
        Animal thisAnimal = new Animal();
        Cow thisCow = new Cow();
        Sheep thisSheep = new Sheep();

        thisAnimal.animalSound();
        thisCow.animalSound();
        thisSheep.animalSound();

        System.out.println("__end__");
    }
    
}


