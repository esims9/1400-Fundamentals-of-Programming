import java.util.*;

class PokemonGame {
   public static void main(String[] args) {
      System.out.println("Pokemon Battle");
      Scanner in = new Scanner(System.in);
      Random r = new Random();
      String turn = "";
      Pokemon p1 = new Pokemon();
      Pokemon p2 = new Pokemon();
   
      System.out.println("Your HP: " + p1.getHp());
      System.out.println("Opponent HP: " + p2.getHp());
      System.out.println("Press h to hit, q to quit: ");
         
      do {
         turn = in.next();
         if(turn.equalsIgnoreCase("h")) {
            p1.setRandomStrength();
            p2.setRandomStrength();
            System.out.print("You've started battle! Your strength: " + p1.getStrength() + ", their strength: " + p2.getStrength() + ".");
            if (p1.getStrength() > p2.getStrength()) {
               int damageThey = p1.getStrength() - p2.getStrength();
               System.out.println(" They have " + damageThey + " damage.");
               p2.setHp(p2.getHp()-damageThey);
               System.out.println("Your HP: " + p1.getHp());
               System.out.println("Opponent HP: " + p2.getHp());
               System.out.println("Press h to hit, q to quit: ");
                  
            } 
            else if (p1.getStrength() < p2.getStrength()) {
               int damageYou = p2.getStrength() - p1.getStrength();
               System.out.println(" You have " + damageYou + " damage.");
               p1.setHp(p1.getHp()-damageYou);
               System.out.println("Your HP: " + p1.getHp());
               System.out.println("Opponent HP: " + p2.getHp());
               System.out.println("Press h to hit, q to quit: ");
            }
         
         }
            
         else if (turn.equalsIgnoreCase("q")){
            System.out.println("Goodbye!");
         }
      } while (!(p1.getHp() < 0 || p2.getHp() < 0));
         System.out.println("Great game!");
   
     
   }
}