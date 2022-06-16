import java.util.Scanner;

public class IdentifierCheck {

   public static void main(String[] args) {

      System.out.println("This program checks the properness of a proposed Java variable name.");
      
      Scanner scanner = new Scanner(System.in);
      
      String str = "";
      
      System.out.println("Enter a variable name (q to quit) : ");
      str = scanner.nextLine();
      
      while (!str.equalsIgnoreCase("q")) {
      
         boolean legal = true;
         boolean goodStyle = true;
         
         for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (!(Character.isLetter(current) || Character.isDigit(current))){
                goodStyle = false;
            }
            if (current == ' ') {
               legal = false;
            }
         }   
         
         if (!Character.isLetter(str.charAt(0))) {
            legal = false;
         }
                  
         if (legal && goodStyle) {
               System.out.println("Good!");
         } 
         
         if (goodStyle == false && legal == true){
               System.out.println("Legal, but uses poor style.");
         }
         
         if (legal == false){
               System.out.println("Illegal.");
         }
               
         System.out.println("Enter a variable name (q to quit) : ");
         str = scanner.nextLine();
     }
         
      scanner.close();
      
   }
}