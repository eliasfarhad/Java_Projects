
public class project1 {

   static String inFileName = "project1.txt";
   
   public static void main(String[] args) {
      String[] myArray = new String[40];
      
      Project1_GUI gui = new Project1_GUI();
      gui.initialize();
      gui.inputFromFile(inFileName, myArray);
   }
    
}


