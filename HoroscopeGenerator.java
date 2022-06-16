import java.util.Scanner;
import java.util.Random;

public class HoroscopeGenerator {

   public static void main(String[] args) {
         
      Scanner in = new Scanner (System.in);
   
      int birthMonth = 0;
      String operation = "y";
      String astrologicalSign = "";
      
      while (!operation.equals("n")) {
   
         //Get user birth month and birth date
         System.out.println("Horoscope Generator");
         System.out.println("Enter your Birth Month (1-12): ");
         birthMonth = in.nextInt();
         System.out.println("Enter your Birth day: ");
         int birthDay = in.nextInt();
      
         //Jan
         if (birthMonth == 1) {
            if (birthDay >= 1 && birthDay <= 19) {
               astrologicalSign = "Capricorn";                      
            }
            else if (birthDay >= 20 && birthDay <= 31) {
               astrologicalSign = "Aquarius";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Feb
         if (birthMonth == 2) {       
            if (birthDay >= 1 && birthDay <= 19) {
               astrologicalSign = "Aquarius";                       
            }
            else if (birthDay >= 20 && birthDay <= 28) {
               astrologicalSign = "Pisces";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //March
         if (birthMonth == 3) {       
            if (birthDay >= 1 && birthDay <= 20) {
               astrologicalSign = "Pisces";                       
            }
            else if (birthDay >= 21 && birthDay <= 31) {
               astrologicalSign = "Aries";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //April
         if (birthMonth == 4) {       
            if (birthDay >= 1 && birthDay <= 19) {
               astrologicalSign = "Aries";                       
            }
            else if (birthDay >= 20 && birthDay <= 30) {
               astrologicalSign = "Taurus";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
          //May
         if (birthMonth == 5) {       
            if (birthDay >= 1 && birthDay <= 20) {
               astrologicalSign = "Taurus";                       
            }
            else if (birthDay >= 21 && birthDay <= 31) {
               astrologicalSign = "Gemini";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //June
         if (birthMonth == 6) {       
            if (birthDay >= 1 && birthDay <= 20) {
               astrologicalSign = "Gemini";                       
            }
            else if (birthDay >= 21 && birthDay <= 30) {
               astrologicalSign = "Cancer";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
          //July
         if (birthMonth == 7) {       
            if (birthDay >= 1 && birthDay <= 22) {
               astrologicalSign = "Cancer";                       
            }
            else if (birthDay >= 23 && birthDay <= 31) {
               astrologicalSign = "Leo";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Aug
         if (birthMonth == 8) {       
            if (birthDay >= 1 && birthDay <= 22) {
               astrologicalSign = "Leo";                       
            }
            else if (birthDay >= 23 && birthDay <= 31) {
               astrologicalSign = "Virgo";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Sept
         if (birthMonth == 9) {       
            if (birthDay >= 1 && birthDay <= 22) {
               astrologicalSign = "Virgo";                       
            }
            else if (birthDay >= 23 && birthDay <= 30) {
               astrologicalSign = "Libra";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Oct
         if (birthMonth == 10) {       
            if (birthDay >= 1 && birthDay <= 22) {
               astrologicalSign = "Libra";                       
            }
            else if (birthDay >= 23 && birthDay <= 31) {
               astrologicalSign = "Scorpio";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Nov
         if (birthMonth == 11) {       
            if (birthDay >= 1 && birthDay <= 22) {
               astrologicalSign = "Scorpio";                       
            }
            else if (birthDay >= 23 && birthDay <= 30) {
               astrologicalSign = "Sagitarius";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         //Dec
         if (birthMonth == 12) {       
            if (birthDay >= 1 && birthDay <= 21) {
               astrologicalSign = "Sagitarius";                       
            }
            else if (birthDay >= 22 && birthDay <= 31) {
               astrologicalSign = "Capricorn";
            }
            else {
               System.out.println("Invalid option.");
            }                                   
         }
         
         if (!astrologicalSign.equals("")) {
         
            Random r = new Random();
            int number = 0;
            number = r.nextInt(5);
         
            String horoscopePhrase = "";
            if (number == 0)
               horoscopePhrase = "There is nothing impossible to they who will try.";
            else if (number == 1)
               horoscopePhrase = "Life has got all those twists and turns. You’ve got to hold on tight and off you go."; 
            else if (number == 2)
               horoscopePhrase = "Keep your face always toward the sunshine, and shadows will fall behind you.";
            else if (number == 3)
               horoscopePhrase = "Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell.";
            else if (number == 4)
               horoscopePhrase = "Success is not final, failure is not fatal: it is the courage to continue that counts.";
            else if (number == 5)
               horoscopePhrase = "You define your own life. Don’t let other people write your script.";
            System.out.println("You are a " + astrologicalSign + ". " + horoscopePhrase);
         }
         
         System.out.println("Would you like to do this again? y/n: ");
         operation = in.next();
         if (operation.equals("n")) {
            System.out.println("Goodybye!");
         
         }
      }   
   }
}
