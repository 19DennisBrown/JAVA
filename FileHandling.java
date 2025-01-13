

    
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;    
import java.io.IOException;
import java.util.Scanner;    

public class FileHandling {

    public void createNewFile(){ //creating functions
        try{
            File newFile = new File("newFile.txt");
            if(newFile.createNewFile()){
                System.out.println("Success. Created file:> "+ newFile.getName());
            } else{
                System.out.println("Name already exist");
            }
        } catch(IOException e){
            System.out.println("An ERROR occurred");
            e.printStackTrace();
        }
    }

    public void writeFiles(){ //writing functions
        try{
            FileWriter writerFile = new FileWriter("newFile.txt");
            writerFile.write("Here  we goo/");
            writerFile.close();

            System.out.println("Successfull. Edited file:> ");
        } catch(IOException e){
            System.out.println("An ERROR happened at writing file.");
            e.printStackTrace();
        }
    }

    public void readFiles(){
        try {
            File myObj = new File("newFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void deleteFiles(){
        File myObj = new File("newFile.txt"); 
        if (myObj.delete()) { 
        System.out.println("Deleted the file: " + myObj.getName());
        } else {
        System.out.println("Failed to delete the file.");
        } 

    }
    public static void main(String[] args){
        FileHandling create = new FileHandling();
        create.createNewFile(); //calling create method
        create.writeFiles(); //calling write methods
        create.readFiles(); //calling read methods
       

        System.out.println("File handling______________");
    }

}
