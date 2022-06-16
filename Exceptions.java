import java.util.*;

public class Exceptions {
   
   public static void main (String[] args) {
      
      Scanner in = new Scanner (System.in);

      double height = 0;
      double weight = 0;
      boolean error = false;
      
      System.out.println("What is your height in inches: ");
      
      do {
         try {
            error = false;
         
            height = in.nextDouble();
            
            if (height < 0){
               System.out.println ("Invalid height value. Must be a positive number.");
               System.out.println("Re-enter height in inches.");
            }
         }
         catch (InputMismatchException e) {
            error = true;      
                       
            System.out.println("Invalid height value. Must be a number.");
            System.out.println("Re-enter height in inches.");
            
            in.nextLine();
         }                 
      } while (error || height < 0);
      
      System.out.println("What is your weight in pounds: ");     
      
      do {
         try {
            error = false;   
            
            weight = in.nextDouble();
            
            if (weight < 0){
               System.out.println ("Invalid weight value. Must be a positive number.");
               System.out.println("Re-enter weight in pounds.");
            }
         }
         catch (InputMismatchException e) {
         
            error = true;
         
            System.out.println("Invalid weight value. Must be a number.");
            System.out.println("Re-enter weight in pounds.");
            
            in.nextLine();
         }
      } while (error || weight < 0);
      
      in.nextLine();
      
      double bmiWeight = weight * 704;
      double bmiHeight = height * height;
      double bmiCombo = bmiWeight / bmiHeight;
      
      System.out.println("height = " + height + " inches.");
      System.out.println("weight = " + weight + " pounds.");
      System.out.println("Body mass index = " + bmiCombo);

   }
}

      