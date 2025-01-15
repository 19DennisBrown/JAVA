


public class ArraySum {
    
    public void thisFunc(){

        int [] thisArray = {1, 2, 4, 6, 4, 3};
        int sum = 0;
        

        for(int i : thisArray){
            sum += i;
        }

        System.out.println("Sum of thisArray is:___" + sum);

    }
    public static void main(String[] args){
        ArraySum methodObj = new ArraySum();
        methodObj.thisFunc();

        System.out.println("end____");
    }
}


