import java.nio.file.attribute.FileStoreAttributeView;
import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        int favInt = 0;
        double favDouble = 0;
        // Get user input and call function
        favInt = SafeInput.getInt(in, "Enter your favorite Integer");
        favDouble = SafeInput.getDouble(in,"Enter your favorite Double");
        //Output result
        System.out.println("\nWhat is your favorite Integer: " + favInt);
        System.out.println("Your favorite Double is: " + favDouble);

    }
}