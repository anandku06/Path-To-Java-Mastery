import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        // How to write a file in Java

        // FileWriter -> good for small or medium-sized text files
        // BufferedWriter -> better performance for large amounts of text
        // PrintWriter -> best for structured data, like reports or logs
        // FileOutputStream -> best for binary files (e.g. images, audio files)

        // FileWriter object used to create a file with the specified name -> as it can be fail, so enclosing it with try-resources...catch block to handle any errors
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like Pizza"); // writes any string data to the file
            System.out.println("File has been written!!");
        }
        catch(IOException e){
            System.out.println("File creation failed!!");
            System.out.println(e);
        }
        // throws mainly IOException
    }
}
