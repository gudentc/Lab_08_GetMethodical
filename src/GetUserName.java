import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        String firstName = "";
        String lastName = "";
        // Get user input and call function
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        //Output result
        System.out.println("\nYour full name is: " + firstName + " " + lastName);


    }
}