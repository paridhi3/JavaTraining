/*
Assignment : OrderManagementSystem
 
1. Accept(input) a list of items - price, quantity >=3, for loop
2. Calculate the total order cost:
		Apply discount and get Discounted price: 
		-> if total cost>=5000 && total cost<=10000, 10% discount
	    -> if total cost>10000, 20% discount
					
		After getting Discounted price calculate shipping:
			Shipping -> if discounted price >= 7500, shipping charge=0
            		 -> if discounted price < 7500, shipping charge=250
            		 
Output Bill -> Original Cost
               How much discount -> Discounted Cost
               Shipping Cost -> 0 or 250
               Final Cost that customer pay
 */

package JavaBasicsPkg;

import java.util.Scanner;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = sc.nextInt();
        
        double[] itemPrices = new double[itemCount];
        
        double originalCost = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter price of item " + (i+1) + ": ");
            double price = sc.nextDouble();
            itemPrices[i] = price;
            originalCost += itemPrices[i];
        }
        
        double discountRate = 0;
        
        if (originalCost >= 5000 && originalCost <= 10000) {
            discountRate = 0.10; // 10% discount
        } else if (originalCost > 10000) {
            discountRate = 0.20; // 20% discount
        }
        
        double discount = originalCost * discountRate;
        double discountedPrice = originalCost - discount;

        double shippingCharge = (discountedPrice >= 7500) ? 0 : 250;
                                
       double finalAmount = discountedPrice + shippingCharge;

       System.out.println("\n--- Bill Details ---");
       System.out.println("Original Cost: ₹" + originalCost);
       System.out.println("Discount Applied: ₹" + (originalCost-discountedPrice));
       System.out.println ("Shipping Charge: ₹"+ shippingCharge);
       System.out.println ("Final Amount Payable: ₹"+ finalAmount);

     }

}
