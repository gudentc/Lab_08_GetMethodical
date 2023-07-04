import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        String ssn = "";
        String menu = "(O)pen, (S)ave, (V)iew, (Q)uit";
        String idNum = "";
        String menuChoice = "";
        // Get user input and call function
        idNum = SafeInput.getregExString(in,"Enter your student id in this format M***** ", "(M|m)\\d{5}");
        ssn = SafeInput.getregExString(in, "Enter your SSN this way ***-**-**** ","\\d{3}-\\d{2}-\\d{4}");
        //Output result
        System.out.println("\nYou have entered: SSN = " + ssn + "\tID = " + idNum);
        System.out.println("\n" + menu);
        menuChoice = SafeInput.getregExString(in,"Choose from the menu options ","[OoSsVvQq]");
        System.out.println("\nYou chose: " + menuChoice);
        System.out.println("Have a good evening!");
    }
}