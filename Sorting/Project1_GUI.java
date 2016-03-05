import java.util.StringTokenizer;
import javax.swing.*;
import java.awt.*;


public class Project1_GUI {
   
   static TextFileInput inFile;
   static String inFileName = "project1.txt";
   static JFrame myFrame;
   static Container cPane;
   static TextArea Original, Sorted;

   public void initialize() {
      inFile  = new TextFileInput(inFileName);
      Original = new TextArea();
      Sorted  = new TextArea();
      myFrame  = new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("Project 1");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } //initialize

   public void inputFromFile(String fileName, String[] array){
       
       myFrame.setLayout( new GridLayout(1, 2) ); //1 row, 2 columns
       cPane = myFrame.getContentPane(); //retrieve content pane of myFrame
       cPane.add(Original); //text area for Original strings on the left
       cPane.add(Sorted);   //text area for Sorted strings on the right
    
       int lengthFilled = 0;
       String line;
       line = inFile.readLine(); //read first line  
       
       while(line != null){
           StringTokenizer tokenizer = new StringTokenizer(line, ",");
           String token = tokenizer.nextToken(); //Store a string token
           
           while (tokenizer.hasMoreTokens()){
              array[lengthFilled++] = token;
              Original.append(token + "\n");  //add this string to the left side
              token = tokenizer.nextToken();  //read the next token
              }// while
           
           array[lengthFilled++] = token;
           Original.append(token + "\n");  //add this string to the left side
           line = inFile.readLine();         //read the next line  
        }// while
       
       
       for ( int i = 0; i < lengthFilled - 1; i++ ) { 
          int indexLowest = i; 
          
          int j = i + 1;
          while (j < lengthFilled){
             
             if ( (array[j].compareTo(array[indexLowest])) < 0 )
                indexLowest = j;
             
             j++;
             }// while j
          
          if (array[indexLowest] != array[i]) { 
             String temp = array[indexLowest];
             array[indexLowest] = array[i]; 
             array[i] = temp; 
             Sorted.append(array[i] + "\n");
             
             if(i == lengthFilled-2)
                Sorted.append(array[indexLowest] + "\n");
             }
          
          else{
             Sorted.append(array[indexLowest] + "\n");
             if (i == lengthFilled-2){
                j--;
                Sorted.append(array[j] + "\n");
                }
          
           } // if
          
        } // for i
       myFrame.setVisible(true);            // make the JFrame visible
       
    } //inputFromFile
}
