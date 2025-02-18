import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // how to read a file using Java

        // BufferedReader + FileReader -> best for reading text files line-by-line 
        // FileInputStream -> best for binary files (e.g. images audio files)
        // RandomAccessFile: best for read/write specific portions of a large files
        
        String filePath = "C:\\Users\\risha\\OneDrive\\Desktop\\test.txt";
        // path of the file to be read

        // reading the writed file can be dangerous code, so enclosing it in try-catch block
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line; // declared a local variable to contain the lines of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // using the loop to read the lines until eof(end of file) or null is reached
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
