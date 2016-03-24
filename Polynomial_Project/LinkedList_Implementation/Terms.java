
import java.util.Scanner;
import java.util.StringTokenizer;

public class Terms {
   
   public LinkedPoly initiate() {
      LinkedPoly list = new LinkedPoly();
      
      int size = 0;
      int coef;
      int exp;
      
      Scanner scan = new Scanner(System.in);         // take the user input for the second polynomial
      String line = scan.nextLine();     
                                                     // tokenize the string based on the delimiter
      StringTokenizer tokenizer = new StringTokenizer(line, ",");
      
      String token = tokenizer.nextToken();
      coef = Integer.parseInt(token);
      
      token = tokenizer.nextToken();
      exp =  Integer.parseInt(token);
      
      list.append(coef, exp, size);
      size++;
      
   // keep taking tokens as long as it is not empty
   // Time complexity = big-theta(n)
      while(tokenizer.hasMoreTokens()) {    
         
            token = tokenizer.nextToken();
            coef = Integer.parseInt(token);
         
            token = tokenizer.nextToken();
            exp = Integer.parseInt(token);
         
            list.append(coef, exp, size);
            size++;
      }
      
      return list;
   }
   
   
}