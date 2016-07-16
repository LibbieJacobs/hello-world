import java.util.Scanner;

public class GoodEats {
    public static void main(String[] args) {
        
        //Declare Variables
        String sCustomerName = "";          //Name of user
        int nItemsNo = 0; 
        int nCount = 0 ;
        double dSum0 = 0.00;
        double dSum1 = 0.00;
        double dSum2 = 0.00;
        double dsalesTax1 = 0.00;
        double dsalesTax2 = 0.00;
        double damountDue1 = 0.00;
        double damountDue2 = 0.00;
      
        
        
        //Declare constants
        
        final int SENTINEL = 10; 
        final double dSalesTaxRate = 6.5;//Fixed sales tax rate
        final double dPercentage = 100;//Percentage conversion
        final double dsalad = 4.95;
        final double dsoup = 3.95;
        final double dchips = 3.49;
        final double dpotato = 3.95;
        final double dturkey = 8.95;
        final double dburger = 9.95;
        final double dsoda = 1.50;
        final double dwater = 1.50;
        final double dpie = 2.99;
    
        //input
        Scanner input = new Scanner(System.in);
        
        //Prompt user for product name
        System.out.print ("Please enter your name:");
        
        //Read customer name from user
        sCustomerName = input.nextLine();
        
    System.out.println();
    System.out.print("GOOD EATS MENU");
    System.out.println();
    
    System.out.print("1. Salad                 " + "$"   +   dsalad + "\n");
    System.out.print("2. Soup                  " + "$"   +   dsoup + "\n");
    System.out.print("3. Chips and Salsa       " + "$"   +   dchips + "\n");
    System.out.print("4. Baked potato          " + "$"   +   dpotato + "\n");
    System.out.print("5. Turkey sandwich       " + "$"   +   dturkey + "\n");
    System.out.print("6. Cheeseburger          " + "$"   +   dburger + "\n");
    System.out.print("7. Soda                  " + "$"   +   dsoda + "\n");
    System.out.print("8. Bottled water         " + "$"   +   dwater + "\n");
    System.out.print("9. Key lime pie          " + "$"   +   dpie + "\n");
    System.out.print("10.Complete my order");
    
    System.out.println();
    
     
  
    //Prompt user
        System.out.print("Please select an item from the menu above:" );
        
    //Read value from user
        nItemsNo = input.nextInt();  
        
        // Libbie : if (nItemsNo != SENTINEL) 
         //Libbie: {
	//Libbie: while instead of for
         for(nItemsNo = 0; nItemsNo < 11; nItemsNo++) {    
        
         nCount++;
         
        
   
        //Prompt user
        System.out.print("Please select another item from the menu above:" );
        
        //Read value from user
        nItemsNo = input.nextInt(); 
	//Libbie: if (nItemsNo != SENTINEL)
	//Libbie: break;
        //Libbie: }
        
        
             
     }//end for loop
     
     System.out.println(); 
     
   
        
        System.out.print("Thank you for ordering with Good Eats, " + sCustomerName + "\n");
        
        System.out.print("Total items ordered: " + nCount + "\n" );   
        
     
        
     dSum1 = (dsalad + dsoup + dchips + dpotato + dturkey + dburger + dsoda + dwater + dpie);
    
     dSum2 = dsalad;
     
     dsalesTax1 = dSum1 * dSalesTaxRate / dPercentage;
     
     dsalesTax2 = dSum2 * dSalesTaxRate / dPercentage;
     
     damountDue1 = dSum1 + dsalesTax1;
     
     damountDue2 = dSum2 + dsalesTax2;
     
     
     
        if (nCount == 9){
            System.out.print("Price of food ordered: " + "$" + dSum1 + "\n");
        
        }
        
        else if (nCount == 1){
            System.out.print("Price of food ordered: " + "$" + dSum2 + "\n");
            
        }
                
        else if (nItemsNo == 10){
            System.out.print("Price of food ordered: " + "$" + dSum0 + "\n");
        }
       
        if (nCount == 9){
            System.out.print("Sales Tax: " + "$" + dsalesTax1 + "\n");
        
        }
        
        else if (nCount == 1){
               System.out.print("Sales Tax: " + "$" + dsalesTax2 + "\n");
        }
        
        if (nCount == 9){
            System.out.print("Total amount due: " + "$" + damountDue1 + "\n");
        
        }
        
        else if (nCount == 1){
            System.out.print("Total amount due: " + "$" + damountDue2 + "\n");
     
        }

        
        
          
   
          
        
       
     
       
    
        
        
    }
    
}
