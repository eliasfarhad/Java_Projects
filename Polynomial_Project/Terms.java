package Polynomials;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Terms {

   public int[] initiate(int size) {
      int[] myArray = new int[size];
      
      Scanner scan = new Scanner(System.in);         // take the user input for the second polynomial
      String line = scan.nextLine();
      
   // tokenize the string based on the delimiter
      StringTokenizer tokenizer = new StringTokenizer(line, ",");
      String token = tokenizer.nextToken();
      
      int i = 0;
      
   // keep taking tokens as long as it is not empty
      while(tokenizer.hasMoreTokens()) {
         myArray[i] = Integer.parseInt(token);
         token = tokenizer.nextToken();
         i++;
      }
      myArray[i] = Integer.parseInt(token);
      
      return myArray;
   }
   
}