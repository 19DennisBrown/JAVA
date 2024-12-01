
public class Encapsulation{

    private String country;
    // get method
    public String getCountry(){
        return country;
    }
    // set method.
    public void setCountry( String newCountry){
        this.country = newCountry;
        // System.out.println( newCountry);
    }

    public static void main(String[] args){

        Encapsulation newObj = new Encapsulation();
        newObj.setCountry("Lanagas");

        System.out.println(newObj.getCountry());
        System.out.println("__end__");
    }
}