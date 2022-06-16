import java.util.Scanner;

public class ChallengeRoadTrip {

   public static void main (String args[]){
      
         Scanner in = new Scanner (System.in);
     
         //Destination
         System.out.println("Please enter your destination:");
         String destination = in.nextLine();

      
         //Miles
         System.out.println("How many miles is it to " + destination + "?");
         double miles = in.nextDouble();
         
         
         //Speed Limit
         System.out.println("What is the speed limit?");
         int speedLimit = in.nextInt();
         
        
         //Speed
         System.out.println("How fast do you plan on drifving over the speed limit (in mph)?");
         double mph = in.nextDouble();
         
         
         //Results
         System.out.println("You will arrive in Seattle, Washington " + ((miles / speedLimit - miles / (speedLimit + mph)) * 60) + " minutes faster by driving " + mph + " mph over the speed limit.");
      
   }
   
}