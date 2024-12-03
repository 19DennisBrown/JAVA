

package Inheritance;

class Africa{

    protected String name = "Largest continent";
    public void climate(){

        System.out.println("Hot, humid and rainy.");
    }
}

class Kenya extends Africa{

    private String dub = "Silicon Savannah";
    public String getDub(){
        return dub;
    }

    public static void main(String[] args){

        Kenya newObj = new Kenya();
        System.out.println(newObj.getDub());
    }
}



