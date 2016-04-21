/**
 * A program that accepts one polynomial (hard-coded) and another polynomial given by the user.
 * It adds, subtracts and multiplies the polynomials and saves the resulting polynomials in different arrays.
 * Finally, the resulting arrays are evaluated for a value given by the user. The program skillfully
 * uses just one array to save both the exponents (array index) and the coefficients (array value) of
 * a polynomial.
 * input example: 4X^2 + 5X + 6  should be inserted as 6,5,4
 */

package Polynomials;

import java.util.Scanner;


public class App {

   public static void main(String[] args) {
      int size = 10;
      
      Polynomial poly3 = new Polynomial(2*size);       // Passing double of the size for multiplication purpose
      
      Polynomial poly1 = new Polynomial(-1,4,3);       // This constructor will be used for hard-coded polynomial
      Polynomial poly2 = new Polynomial();             // This will be used for a polynomial of unknown degree (given by the user).
      
      Terms terms = new Terms();
      
      int[] p1 = new int[10];
      int[] p2 = new int[10];
      
      p1 = poly1.givenMethod();                   // set the hard-coded polynomial to an array and return that array.
     
      System.out.println("Please enter term coefficients of the second polynomial (seperated by commas, no spaces)\n in ascending order (in terms of exponent)");
      System.out.print("Enter: ");
      p2 = terms.initiate(10);
      
      // take the user input for the value c
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter an integer value 'c' for which you want to evaluate the resulting polynomial: ");
      int c = scanner.nextInt();
      
      int[] addedPoly = poly2.add(p1, p2);
      System.out.print("\nPolynomial 1 + Polynomial 2:   ");
      int added_result = poly2.print(addedPoly, c);
      
      int subbedPoly[] = poly2.sub(p1, p2);
      System.out.print("\nPolynomial 1 - Polynomial 2:   ");
      int sub_result = poly2.print(subbedPoly, c);
      
      int[] multiedPoly = poly3.multiply(p1, p2);
      System.out.print("\nPolynomial 1 * Polynomial 2:   ");
      int mult_resut = poly3.print(multiedPoly, c);
      
      
   }
   
}
