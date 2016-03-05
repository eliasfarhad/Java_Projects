/**
 * A program that computes the maximum total from top of the triangle and moving to 
 * adjacent numbers on the row below. It reads a text file containing a triangle 
 * with 100 rows.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Triangle {

   public static void main(String[] args) throws IOException {

      String fileName = "triangle.txt";
      File textFile = new File(fileName);
      Scanner in = new Scanner(textFile);
      BufferedReader br = new BufferedReader(new FileReader(textFile));

      int height = 0;
      String line2 = null;
      while ((line2 = br.readLine()) != null) {
         height++;
      }
      System.out.println("The height of the triangle is: " + height + " rows.");
      
      int[][] myArray = new int[height][height];
      
      int row = 0;
      String line;
      line = in.nextLine();                                     // read the first line

      while (in.hasNextLine() || row < 100) {                   // the loop is true if there is at least one more line left 
                                                                // or the row count is less than 100.
         StringTokenizer tokenizer = new StringTokenizer(line, " ");
         String token = tokenizer.nextToken();                  // Store a string token

         int col = 0;

         while (tokenizer.hasMoreTokens()) {
            myArray[row][col++] = Integer.parseInt(token);
            token = tokenizer.nextToken();                      // read the next token
         }

         myArray[row][col++] = Integer.parseInt(token);
         row++;

         if (row != 100)
            line = in.nextLine();                              // keep on reading the next line (until the row count has hit 100)
      }

      int total = 0;
      int i = 0;
      int j = 0;
      
      total = total + myArray[i][j];                            // add the first number of the first row
      i++;

      while (i < 100) {
         if (myArray[i][j] > myArray[i][j +1 ]) {               // compare two adjacent numbers of the next row
            total = total + myArray[i][j];
         }
         else {
            total = total + myArray[i][++j];
         }
         i++; 
      }

      System.out.println("\nThe maximum total from top to bottom is: " + total);                // print result

      in.close();
   }
}
