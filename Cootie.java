import java.util.*;

public class Cootie {

   private int finalChoice;
   private String[] catcher = new String[8];
   
   public Cootie(){
      catcher = new String[] {"Yes.", "Maybe?", "Immediately No.", "Of course.", "You can be sure.", "Absolutely!", "Nope.", "Someday."};
   }
   
   public void setCatcher(String[] catcher) {
      this.catcher = catcher;
   }
   
   public String[] getCatcher() {
      return this.catcher;
   }
   
   public void setFinalChoice(int finalChoice) {
      this.finalChoice = finalChoice;
   }
   
   public int getFinalChoice() {
      return this.finalChoice;
   }
   
   public String makeChoice(int finalChoice) {
      this.finalChoice = finalChoice;
      return catcher[finalChoice-1]; 
   }

}