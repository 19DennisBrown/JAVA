



public class WordCounter {
    
    public void countWords(){

        String words = "One Two Three Four";
        int countWord = words.split("\\s").length;
        System.out.println("Total words is :__" +countWord);
    }

    public static void main(String[] args){

        WordCounter methodObj = new WordCounter();
        methodObj.countWords();

        System.out.println("End_______________");
    }
}
