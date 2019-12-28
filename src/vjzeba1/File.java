package vjzeba1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public static void main(String[] args) {
        
        String myText = "Hello world";
        try(BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))){
            String line;
            while((line = br.readLine()) != null){  // ?
                System.out.println(line);
            }
        }catch(IOException exc){
            System.out.println(exc);
        }
        
    }
    
}
