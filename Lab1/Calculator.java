import java.util.*;
public class Calculator {
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("CALCULATOR APPLICATION");
    System.out.println("\n 1. Addition");
    System.out.println("\n 2. Subtraction");
    System.out.println("\n 3. Multiplication");
    System.out.println("\n 4. Division");
    System.out.println("\n 5. Exit");
    System.out.println("\n -----------------------------------------------------");
    
    float val1,val2,val3;
    boolean flag=true;
    while(flag!=false){
    System.out.println("\n select the operation");
    int ch=0;
    ch = ob.nextInt();
    switch (ch) {
        case 1:
            System.out.println("\n ADDITION");
            System.out.println("\n Enter the first value");
            val1 = ob.nextFloat();
            System.out.println("\n Enter the second value");
            val2 = ob.nextFloat();
            val3 = val1+val2;
            System.out.println("\n Result = "+val3);
            break;
        case 2:
            System.out.println("\n SUBTRACTION");
            System.out.println("\n Enter the first value");
            val1 = ob.nextFloat();
            System.out.println("\n Enter the second value");
            val2 = ob.nextFloat();
            val3 = val1-val2;
            System.out.println("\n Result = "+val3);
            break;
        case 3:
            System.out.println("\n MULTIPLICATION");
            System.out.println("\n Enter the first value");
            val1 = ob.nextFloat();
            System.out.println("\n Enter the second value");
            val2 = ob.nextFloat();
            val3 = val1*val2;
            System.out.println("\n Result = "+val3);
            break;
        case 4:
            System.out.println("\n DIVISION");
            System.out.println("\n Enter the first value");
            val1 = ob.nextFloat();
            System.out.println("\n Enter the second value");
            val2 = ob.nextFloat();
            val3 = val1/val2;
            System.out.println("\n Result = "+val3);
            break;
        case 5:
            System.out.println("\n EXIT");
            flag=false;
            break;
        default: System.out.println("Invalid choice");
    }
    }
    
    
}
}
