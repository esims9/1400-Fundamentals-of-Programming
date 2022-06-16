import java.util.Scanner;

public class DinoParkParty {

   public static void main (String[] args) {
   
   
      Scanner in = new Scanner (System.in);
      
      int packageChoice = 1;
      
      while (packageChoice != 4) {

         System.out.println("Welcome to Dinosaur Park!");
         System.out.println("Choose the type of party:");
         System.out.println("1. Group Rate Admission Party");
         System.out.println("2. Bare Bones Package");
         System.out.println("3. Deluxe Party Package");
         System.out.println("4. Quit");
         packageChoice = in.nextInt();
    
             
         if (packageChoice == 1 ) {    
            System.out.println("By reserving a group party slot of 10 or more people and with 7 days advanced notice your group will be admitted to the Park at the group discount rate of $5.00 for Adults (13+), and 4.00 Children (2-12) and have a picnic table reserved for two hours.");
            System.out.println("Adults:");
            int adults = in.nextInt();
            System.out.println("Children:");
            int children = in.nextInt();
                   
            double costAdults = 5 * adults;
            double costChildren = 4 * children;
            double totalCost = costChildren + costAdults;
                  
            System.out.println("Total Cost: $" + totalCost);
         }
         
         if (packageChoice == 2 ) {
            System.out.println("Are you a member? Press 1 for yes and 2 for no.");
            int isAMember = in.nextInt();
            
            while (isAMember != 1 && isAMember != 2) 
            {
               System.out.println("That is not a valid option. Please try again.");
               isAMember = in.nextInt();
            }
            
            in.nextLine();
         
            System.out.println("The base cost covers admission for up to 12 people. Enter in the amount of additional people.");
            System.out.println("Additional Adults:");
            int additionalAdults = in.nextInt();
            System.out.println("Additional Children:");
            int additionalChildren = in.nextInt();
   
            double totalCost = 0;
            if (isAMember == 1) {
               totalCost = 99;
            } else { 
               totalCost = 119;
            }
            double additionalCostAdults = 3 * additionalAdults;
            double additionalCostChildren = 3 * additionalChildren;
            double additionalCostAddition = additionalCostChildren + additionalCostAdults;
            totalCost += additionalCostAddition;
                  
            System.out.println("Total Cost: $" + totalCost);
         }
                  
         if (packageChoice == 3 ) {
            System.out.println("Are you a member? Press 1 for yes and 2 for no.");
            int isAMember = in.nextInt();
            
            while (isAMember != 1 && isAMember != 2) 
            {
               System.out.println("That is not a valid option. Please try again.");
               isAMember = in.nextInt();
            }
            
            in.nextLine();
            
            System.out.println("The base cost covers admission for up to 12 people. Enter in the amount of additional people.");
            System.out.println("Additional Adults:");
            int additionalAdults = in.nextInt();
            System.out.println("Additional Children:");
            int additionalChildren = in.nextInt();
   
            double totalCost = 0;
            if (isAMember == 1) {
               totalCost = 175;
            } else { 
               totalCost = 199;
            }
            double additionalCostAdults = 3 * additionalAdults;
            double additionalCostChildren = 3 * additionalChildren;
            double additionalCostAddition = additionalCostChildren + additionalCostAdults;
            totalCost += additionalCostAddition;
                  
            System.out.println("Total Cost: $" + totalCost);
         }
         
         
          if (packageChoice == 4 ) {
            System.out.println("Goodbye.");
         }
      
      }
   
   }

}