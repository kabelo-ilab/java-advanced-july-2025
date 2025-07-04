package Chapter10;

import java.io.*;

public class ReadAndWriteToFile {
    public static void main(String[] args) {

        //writeToFile();
        readFromFile();
    }

    public static void readFromFile(){
        String filePath = "src/main/resources/fruit.txt";
        File myFile = new File(filePath);
        String line = null;

        try {
            //Use a resource to help you read from a file
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);

            line = read.readLine();//Apple

            while (line != null){
                System.out.println(line);//Orange
                line = read.readLine();//null
            }

            read.close();
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

    public static void writeToFile(){
        String filePath = "src/main/resources/fruit.txt";
        File myFile = new File(filePath);

        try{
            myFile.createNewFile();//create a new file
            //Use a resource (PrintStream) to write to a file
            PrintStream pen = new PrintStream(myFile);
            pen.println("Apple");
            pen.println("Mango");
            pen.println("Orange");
            pen.close();//close resource after use
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
