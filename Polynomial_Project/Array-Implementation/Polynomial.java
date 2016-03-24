package Polynomials;

class Polynomial {
   
   private int x, y, z;
   int size;
   
   public Polynomial() {
      
   }
   
   // initialize the variables for the hard-coded polynomial
   public Polynomial(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }
   
   public Polynomial(int size) {
      this.size = size;
   }

   // save the polynomial in an array and return it
   public int[] givenMethod() {
      
      int[] givenArray = new int[10];
      givenArray[0] = x;
      givenArray[1] = y;
      givenArray[2] = z;
      
      return givenArray;
   }
   
   
   // add two polynomials and return the resulting polynomial to the main() method
   // The time complexity for this method is big-theta(n)
   public int[] add(int[] s1, int[] s2) {
      
      int[] summedArray = new int[10];
      
      for (int i= (s1.length-1); i >= 0; i--) {              // s1.length - 1 == 9
         int sumCoeff = s1[i] + s2[i];
         summedArray[i] = sumCoeff;
      }
      
      return summedArray;
   }
   
   // substract two polynomials and return the resulting polynomial to the main() method
   // The time complexity for this method is big-theta(n)
   public int[] sub(int[] s1, int[] s2) {
      
      int[] subbedArray = new int[10];
      
      for (int i= (s1.length-1); i >= 0; i--) {              // s1.length - 1 == 9
         int sumCoeff = s1[i] - s2[i];
         subbedArray[i] = sumCoeff;
      }
      
      return subbedArray;
   }
   
   // multiply two polynomials and return the resulting polynomial to the main() method
   // The time complexity for this method is big-theta(n^2)
   public int[] multiply(int[] s1, int[] s2) {
      
      int[] specialArray = new int[size];
      
      for (int i= (s1.length-1); i >= 0; i--) {
         for (int j= (s2.length-1); j >= 0; j--) {
            int mulCoeff = s1[i] * s2[j];
            int expon = i + j;
            
            if (specialArray[expon] == 0) {
               specialArray[expon] = mulCoeff;
            }
            else {
               specialArray[expon] = mulCoeff + specialArray[expon];
            }
         }
      }
      
      return specialArray;
   }
   
   
   // print the resulting polynomials and after evaluating them for an integer, return the result.
   // The time complexity for this method is big-theta(n)
   public int print (int[] myArray, int n) { 
      
      int result = 0;
      for (int i= (myArray.length-1); i >= 0; i--) {
         
         if (myArray[i] != 0) {
            System.out.print(myArray[i] + "X^" + i + " + ");
            result = (int) (result + (myArray[i]* Math.pow(n, i)));
         }  
      }
      
      System.out.println("\nWhen c = " + n + " , the value is = " + result);
      
      return result;
   }
   
}
