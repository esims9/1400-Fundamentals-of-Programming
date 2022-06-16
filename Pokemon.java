import java.util.*;

public class Pokemon {

   private Random r = new Random();
   private int hp;
   private int strength;
   
   public Pokemon(){
     hp = 100;
     strength = r.nextInt(29)+1;
   } 
   
   public void setHp(int hp) {
      this.hp = hp;
   }
   
   public int getHp() {
      return this.hp;
   }
   
   public void setStrength(int strength) {
      this.strength = strength;
   }
   
   public int getStrength() {
      return this.strength;
   }
   
   public void setRandomStrength() {
      int randomStrength = r.nextInt(29)+1;
      this.setStrength(randomStrength);
   }
   
      
   

}