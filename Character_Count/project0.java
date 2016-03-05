import javax.swing.*;
public class project0
{

    public static void main(String[] args)
    {
        String userInput;
        while(true)
        { 
          //get a user Input
          userInput = JOptionPane.showInputDialog("Enter the sentence. Type stop to exit:\t");
          int digits = 0;      //to count the number of digits
          int upper  = 0;      //to count the number of Upper case letters
          int lower  = 0;      //to count the number of Lower case letters

          // program will stop execution if user types stop
          if (userInput.equalsIgnoreCase("stop")){
             JOptionPane.showMessageDialog(null, "The End");
             System.exit(0);
          }
          else{
               //using loop to count the counts
               for (int i = 0; i < userInput.length(); i++)
                 {
                  if (Character.isDigit(userInput.charAt(i)))
                      digits++;
                  else if (Character.isUpperCase(userInput.charAt(i)))
                      upper++;
                  else if (Character.isLowerCase(userInput.charAt(i)))
                  lower++;
                    }
                  // print counts
                  JOptionPane.showMessageDialog(null, userInput + "\nDigits: " + digits + "\nUpper Case Letters: " + upper + "\nLower Case Letters: " + lower);
               }

        }
    }
}