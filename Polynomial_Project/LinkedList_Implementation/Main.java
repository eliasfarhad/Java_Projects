/**
 * A program that accepts one polynomial (hard-coded) and another polynomial given by the user.
 * It adds, subtracts and multiplies the polynomials and saves the resulting polynomials in different
 * Linked Lists. Finally, the resulting lists are evaluated for a value given by the user. The program
 * uses just one List node to save both the exponent and the coefficient of a polynomial term.
 * 
 * input example: 4X^2 + 5X + 6  should be inserted as 4,2,5,1,6,0
 */

import java.util.Scanner;


public class Main {

   public static void main(String[] args) {
      
      
      LinkedPoly poly1 = new LinkedPoly(3,2,4,1,-1,0);       // This constructor will be used for hard-coded polynomial
      LinkedPoly poly2 = new LinkedPoly();             // This will be used for a polynomial of unknown degree (given by the user).
      
      Terms terms = new Terms();
      
      LinkedPoly list1 = new LinkedPoly();
      LinkedPoly list2 = new LinkedPoly();
      
      LinkedPoly addedList = new LinkedPoly();
      LinkedPoly subList = new LinkedPoly();
      LinkedPoly multList = new LinkedPoly();
      
      list1 = poly1.givenMethod();                   // set the hard-coded polynomial to a linked list and return that list.
      System.out.print("Polynomial 1: ");
      poly1.print(list1, 0);
      
      System.out.println("\nPlease enter term coefficients,exponents of the 2nd polynomial (seperated by commas, no spaces)");
      System.out.println("Example: 4X^2 + 5X + 6  should be inserted as 4,2,5,1,6,0");
     
      System.out.print("Enter: ");
      list2 = terms.initiate();
      System.out.print("\nPolynomial 2: ");
      poly2.print(list2, 0);
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter an integer value for variable  X  to evaluate the resulting polynomial: ");
      int x = scanner.nextInt();
      
      System.out.println("\nPolynomial1 + Polynomial2:");
      addedList = poly2.add(list1, list2);
      int add_result = poly2.print(addedList, x);
      
      System.out.println("Polynomial1 - Polynomial2:");
      subList = poly2.subtract(list1, list2);
      int sub_result = poly2.print(subList, x);
      
      System.out.println("Polynomial1 * Polynomial2:");
      multList = poly2.multiply(list1, list2);
      int mult_result = poly2.print(multList, x);
      
      
   }
   
}
