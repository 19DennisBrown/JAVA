




public class strings{
    public static void main( String[] args){

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String upper = txt.toUpperCase();
        String lower = txt.toLowerCase();
        int indexPosition = txt.indexOf("M");
        System.out.println(txt.length());

        // Concatenation
        String firstName = "Dennis";
        String lastName = "Brown";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        // Special chars
        String txtSp = "It\'s alright.";
    }
}
