import java.util.*;

class CootieGame {
   public static void main(String[] args) {
      System.out.println("Cootie Catcher");
      Scanner in = new Scanner(System.in);
      String userQuestion = "";
      String continuePlay = "";
      String color = "";
      int num = 0;
      
      Cootie cootie = new Cootie();         
      do {
         System.out.println("Ask your Cootie Catcher a question: ");
         userQuestion = in.nextLine();
             
         System.out.print("Choose a color(red, yellow, green, blue): ");
         color = in.nextLine();
               
         while (!color.equalsIgnoreCase("red") && !color.equalsIgnoreCase("yellow") && !color.equalsIgnoreCase("green") && !color.equalsIgnoreCase("blue")) {
            System.out.println("Sorry that is not an option.");
            System.out.print("Choose a color(red, yellow, green, blue): ");
            color = in.nextLine();
         }
         
         if (color.length() % 2 == 0)  {
            while (num != 1 && num != 2 && num != 5 && num != 6) {
               try {
                  System.out.print("Choose a number(1, 2, 5, 6): ");
                  num = in.nextInt();
                  if (num != 1 && num != 2 && num != 5 && num != 6) {
                     System.out.println("Sorry that is not an option.");
                  }
               }         
               catch (InputMismatchException e) {
                  System.out.println("Sorry that is not an option.");
               }
               in.nextLine();
            }
         } else {
            while (num != 3 && num != 4 && num != 7 && num != 8) {
               try {
                  System.out.print("Choose a number(3, 4, 7, 8): ");
                  num = in.nextInt();
                  if (num != 3 && num != 4 && num != 7 && num != 8) {
                     System.out.println("Sorry that is not an option.");
                  }
               }         
               catch (InputMismatchException e) {
                  System.out.println("Sorry that is not an option.");
               }
               in.nextLine();
            }
         }     
         String result = cootie.makeChoice(num);
         System.out.println("Cootie says: " + result);
      
         System.out.println("Would you like to (p)lay again or (q)uit?");
         continuePlay = in.nextLine();
      
      } while (!continuePlay.equalsIgnoreCase("q"));
       
      if (continuePlay.equalsIgnoreCase("q")){
         System.out.println("Thanks for playing!");
      }
   }
}
