

public class Addition{

    public void addNums(){
        int y, f, sum;
        y = 3;
        f = 6;
        sum = y + f;
        System.out.println("The sum of y and f is : " + sum);
    }
    public static void main(String[] args){

        Addition addNumsObj = new Addition();
        addNumsObj.addNums();

        System.out.println("End______");
    }
}