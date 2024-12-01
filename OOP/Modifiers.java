

public class Modifiers{

    // STATIC VS PUBLIC METHODS.

    static void methodStatic( String tag){

        System.out.println("This is a " + tag + " method.");
    }

    public void methodPublic(String tag){

        System.out.println("We have a "+ tag + " method here.");
    }

    public static void main(String[] args){

        methodStatic("static");
        Modifiers newObj = new Modifiers();
        newObj.methodPublic("public");

        System.out.println(" __end__");
    }
}