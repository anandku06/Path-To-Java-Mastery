import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        // How to write a file in Java

        // FileWriter -> good for small or medium-sized text files
        // BufferedWriter -> better performance for large amounts of text
        // PrintWriter -> best for structured data, like reports or logs
        // FileOutputStream -> best for binary files (e.g. images, audio files)

        String filePath = "C:\\Users\\risha\\OneDrive\\Desktop\\test.txt"; // contains the new path for the file : for the filepath use double backslash
        String textContent = "I like Pizza!\nIt's really nice!!"; // now the text content is in this variable
        String textContent2 = "I also like Burger as well\n and I am huungry as well\n Please buy me Pizza or Burger!!";

        // FileWriter object used to create a file with the specified name -> as it can be fail, so enclosing it with try-resources...catch block to handle any errors
        // can also give the path, where the file should be created
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent); // writes any string data to the file
            writer.append(textContent2); // appends the text to the file(not overwritng the previous text)
            System.out.println("File has been written!!");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!");
        }
        catch(IOException e){
            System.out.println("File creation failed!!");
            System.out.println(e);
        }
        // throws mainly IOException
    }
}
