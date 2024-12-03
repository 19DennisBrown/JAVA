

package Inheritance;

class Africa{
    protected String title = "Origin of Man";

    public void climate(){
        System.out.println("Hot, humid and rainy");
    }
}

class Kenya extends Africa{

    private String dubbed = "Silicon Savannah";

    public String getDubbed(){
        return dubbed;
    }

    public static void main(String[] args){

        Kenya newObj = new Kenya();
        newObj.climate();
        System.out.println(newObj.title + " " + newObj.getDubbed());
    }
}



