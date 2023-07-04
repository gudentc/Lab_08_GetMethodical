import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        double itemPrice = 0;
        double totalPrice = 0;
        boolean anotherItem = false;
        System.out.println("\nThe Price Total");
        do {
            // Get user input and call function
            itemPrice = SafeInput.getRangedDouble(in, "Enter the items price: $", .25,15.00);
            totalPrice = totalPrice + itemPrice;
            anotherItem = SafeInput.getYNConfirm(in, "Do you have another item? ");
        }while(anotherItem);
        //Output result
        System.out.println("\nYour total price is: $" + String.format("%,.2f", totalPrice));


    }
}