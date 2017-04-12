import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Supermarket {
public static void main(String args[])
{
String username="Shubhi";
String password = "1234";
Scanner ob = new Scanner(System.in);
String user = ob.nextLine();
String pass = ob.nextLine();
if((username.equals(user)) && (pass.equals(password)))
{
   System.out.println("Welcome user");
}
else
    System.out.println("Try again!");
System.out.println("SUPERMARKET");
System.out.println("PRODUCT ID \t PRICE \t AVAILABLE QUANTITY");
System.out.println("1 Soap \t\t Rs.20 \t\t 5 ");
System.out.println("2 Milk \t\t Rs.40 \t\t 6 ");
System.out.println("3 Tea \t\t Rs.10 \t\t 7 ");
System.out.println("4 Coffee \t\t Rs.30 \t\t 8 ");
System.out.println("5 Ketchup \t Rs.60 \t\t 9 ");
System.out.println("Enter the number of items to be purchased");
String items[]={"Soap","Milk","Tea","Coffee","Ketchup"};
int quantity[]={5,6,7,8,9};
int price[]={20,40,10,30,40};
int num = ob.nextInt();
int bill=0;
while(num>0)
{
    System.out.println("Enter product id");
    int i=ob.nextInt();
    System.out.println("Enter the quantity required");
    int quant=ob.nextInt();
    if(quant>quantity[i-1])
    {
        System.out.println("Not available");
        break;
    }
    quantity[i-1]=quantity[i-1]-quant;
    bill=bill+(price[i-1]*quant);
    num--;
}

System.out.println("total bill : Rs. "+bill);

System.out.println("PRODUCT ID \t PRICE \t AVAILABLE QUANTITY");
for(int j=0;j<items.length;j++)
{
    System.out.print(items[j]);
    System.out.print("\t\t"+price[j]);
    System.out.print("\t\t"+quantity[j]);
    System.out.print("\n");
}




}

}
