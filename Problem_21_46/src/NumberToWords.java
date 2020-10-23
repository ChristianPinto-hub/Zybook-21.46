
import java.util.*;
public class NumberToWords {
   public static String DigitToWord(int digitIn) { 
      
      if (digitIn == 0) {
         return "zero";
      } else if (digitIn == 1) {
         return "one";
      } else if (digitIn == 2) {
         return "two";
      } else if (digitIn == 3) {
         return "three";
      } else if (digitIn == 4) {
         return "four";
      } else if (digitIn == 5) {
         return "five";
      } else if (digitIn == 6) {
         return "six";
      } else if (digitIn == 7) {
         return "seven";
      } else if (digitIn == 8) {
         return "eight";
      } else if (digitIn == 9) {
         return "nine";
      } else {
         return "error";
      }
      
   } 
   
   public static String TensDigitToWord(int digitIn) { 
      
      if (digitIn == 2) {
         return "twenty";
      } else if (digitIn == 3) {
         return "thirty";
      } else if (digitIn == 4) {
         return "forty";
      } else if (digitIn == 5) {
         return "fifty";
      } else if (digitIn == 6) {
         return "sixty";
      } else if (digitIn == 7) {
         return "seventy";
      } else if (digitIn == 8) {
         return "eighty";
      } else if (digitIn == 9) {
         return "ninety";
      } else {
         return "error";
      }
      
   } 
   
   public static String TwoDigitNumToWords(int numIn) { 
      
      String s1 = TensDigitToWord(numIn / 10);
      String s2 = DigitToWord(numIn % 10);
      return (s1 + " " + s2);
      
   } 
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      System.out.println(TwoDigitNumToWords(scnr.nextInt()));
      
   }
}
