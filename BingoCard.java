import java.util.ArrayList;
import java.util.Random;

public class BingoCard{

   public static void main(String []args){
   
      int[][] bingoCard = new int[5][5];
      Random gen = new Random();
      ArrayList <Integer> bingoNum = new ArrayList<>();
      int start = 1;   
                
      for(int r = 0; r < bingoCard.length; r++){         
         bingoNum.clear();
         for(int i = start; i < start + 15; i++){
            bingoNum.add(i);
         }
         
         for(int c = 0; c < bingoCard[0].length; c++){
            int pos = gen.nextInt(bingoNum.size());
            bingoCard[c][r] = bingoNum.get(pos);
            bingoNum.remove(pos);
         }
         start += 15;
      }
      
      bingoCard[2][2] = 0;
      
      String str = "B\tI\tN\tG\tO\n";
      
      for(int r = 0; r < bingoCard.length; r++){
         for(int c = 0; c < bingoCard[0].length; c++){
            if(bingoCard[r][c] > 0){
               str += bingoCard[r][c] + "\t";
            } 
            else {
               str += "0\t";
            }
         }
         str += "\n";
      }
      
      System.out.println(str);
      

	}
}

