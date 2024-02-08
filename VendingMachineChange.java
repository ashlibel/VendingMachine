//Ashley Gutierrez Carreto
//September 13th, 2023
//Lab 5 Dispensing Change
//This code determines the change to be dispensed from a vending machine
//however the price of the item is only accepted between 25 cents to 95 cents
//in the incriments of 5 
import java.util.Scanner;
public class VendingMachineChange
{
    public static void main (String [] args)
    {
        int quarters, dimes, nickels, price, originalPrice; 
    
        System.out.println ("Enter price of item "
                        + "from 25 cents to a dollar,in 5-cent increments: ");
   
     
        Scanner keyboard = new Scanner (System.in);
        price = keyboard.nextInt();
        //user input price between 25 cents to 95 cents
      
        if (price % 5 != 0)
        {
            System.out.println ("Your price is not a multiple to 5"
                            + " Reenter your price of item "
                            + "(from 25 cents to 95 cents,"
                            + " in 5-cent increments):"); 
                            //prints out if not a multiple of 5  
        }
        else if (price > 95)
        
        {
            System.out.println ("Your price is too high"
                            + " Reenter your price of item "
                            + "(from 25 cents to 95 cents,"
                            + " in 5-cent increments):");
        }  
                            //prints out if price is too high
        
         else if (price < 25)
        
        {
            System.out.println ("Your price is too low"
                            + " Reenter your price of item "
                            + "(from 25 cents to 95 cents,"
                            + " in 5-cent increments):");
                            // prints out if it too low 
        } 
        
        else 
        {
        // prices are only 25 cents to 95 cents 
        
        price = 100 - price;
        quarters = price / 25;
        price =  price % 25; 
        dimes = price / 10;
        price = price % 10;
        nickels = price / 5;
        price = price % 5;
       
        // code from the program on 2.11 on p.125 in the textbook
        // arithmetic for dispencing change
        
        System.out.println (" You bought an item for " 
                 + price +  "cents and gave me a dollar ");
      
        System.out.println (" so your change is \n" +
                quarters +  " quarters \n" +
                dimes    +  " dimes and \n" +
                nickels  +  " nickel. ");
        }
    }   
}
