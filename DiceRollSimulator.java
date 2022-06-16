import java.util.Scanner;
import java.util.Random;

public class DiceRollSimulator{
	
   public static void main(String []args){
   
      Scanner in = new Scanner(System.in);
      
      System.out.println("How many dice do you want to roll? ");
      int numberRolls = in.nextInt();
      System.out.println("Dice Rolling Simulation Results");
      System.out.println("Total number of rolls = " + numberRolls);
      int[] count = new int[12];
                  
      for (int i=0; i < numberRolls; i++) {
         Random r = new Random();
         int firstNum = 0;
         firstNum = r.nextInt(5) + 1;
         int secNum = 0;
         secNum = r.nextInt(5) + 1;
         int result = firstNum + secNum;
         count[result-1] = count[result-1] + 1;
      }
      
      for(int i=1; i < count.length; i++) {
         System.out.println(i + 1 + ": " + count[i]);
      }  
	}
}
