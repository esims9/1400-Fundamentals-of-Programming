import java.util.*;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Decoder{  
   public static void main(String []args){
      Scanner in = new Scanner(System.in); 
      String fileName = "";
      File f;
      Scanner fileIn;
      int key = 0;
      
      
      while (!fileName.equals("q")) { 
         System.out.println("Please enter the name of the encrypted file (q to quit.)");
         fileName = in.nextLine();
         
         if (fileName.equals("q")) { 
            System.out.println("Goodbye.");
            return;
         }
                
         try {  
            f = new File (fileName);
            fileIn = new Scanner (f);
           
         }
         catch (FileNotFoundException e) {
            System.out.println("Error. Invalid file.");
            continue;
         }
         
         System.out.println("Enter encryption key (1-5)?");
         key = in.nextInt();
         in.nextLine();
         
         while (key > 5 || key < 1) {
            System.out.println("Invalid input.");
            System.out.println("Enter encryption key (1-5)?");
            key = in.nextInt();
            in.nextLine();
         }
          
         try {         
            PrintWriter fileOut = new PrintWriter ("C:\\Users\\esims\\Downloads\\Decrypted.txt");
                        
            while (fileIn.hasNext())
            {
               String line = fileIn.next();
               String decryptedLine = "";
               for ( int i = 0; i < line.length(); i++) {
                  char letter = line.charAt(i);
                  letter -= key;
                  decryptedLine += letter;
               }
               fileOut.println(decryptedLine);  
            }
            
            fileOut.close();
            System.out.println("File has been decrypted to Decrypted.txt");
         }
         catch (FileNotFoundException e) {
            
            System.out.println("Error. Invalid file.");
         }          
      }
   }
}
