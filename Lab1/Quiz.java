import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Quiz{
    public static void main(String args[]) throws FileNotFoundException
    {
        System.out.println("QUIZ APPLICATION");
        int number=5;
        int mark=0;
        while(number>0)
        {
        try {
            String fileName = "C:\\Users\\Mahe\\Documents\\NetBeansProjects\\JavaApplication1\\src\\questions";
            Scanner ob = new Scanner(System.in);
            int counter = 0;
            String line = null;
            FileReader fileReader = null;

            Random Dice = new Random();
            int rand = Dice.nextInt(25);
            System.out.println(rand);
            fileReader
                    = new FileReader(fileName);

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                counter++;
                if (counter == rand) {
                    System.out.println("" + bufferedReader.readLine());
                }
            }
            
            String fileName1 = "C:\\Users\\Mahe\\Documents\\NetBeansProjects\\JavaApplication1\\src\\answers";
            int counter1 = 0;
            String line1 = null;
            FileReader fileReader1 = null;

           
            fileReader1
                    = new FileReader(fileName1);

            BufferedReader bufferedReader1
                    = new BufferedReader(fileReader1);
                    String real=null;
            while ((line1 = bufferedReader1.readLine()) != null)
            {
          
                counter1++;
                if (counter1 == rand) 
                {
                    real =  bufferedReader1.readLine();
                    break;
                }
            }
             
            System.out.println(real);
            String ans = ob.nextLine();
               boolean match = real.equals(ans);
                    if(match)
                    {
                        System.out.println("correct answer");
                        mark++;
                    }
                    else
                        System.out.println("wrong answer");
               
            }
            
            

         catch (Exception e) {
          e.printStackTrace();

        }
        number--;
        }
        System.out.println("your score out of 5 is :"+mark);
        
}
}
