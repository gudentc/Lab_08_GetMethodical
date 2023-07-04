import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        int menuChoice = 0;
        boolean nextOption = false;
        do {
            System.out.println("\n          Menu");
            System.out.println("\n1 - Celsius to Fahrenheit Converter");
            System.out.println("\n2 - Display the CtoF table");
            menuChoice = SafeInput.getRangedInt(in, "\nSelect from the menu: ", 1, 2);
            if (menuChoice == 1) {
                celsius = SafeInput.getDouble(in, "Enter the Celsius temperature of your choice");
                fahrenheit = CelsiusToFahrenheit(celsius);
                System.out.println(String.format("\n%.1f", +celsius) + "C equals " + String.format("%.1f", +fahrenheit) + "F");
                if (celsius == 0) {
                    System.out.println("The freezing point of water");
                }
                if (celsius == 100) {
                    System.out.println("The boiling point of water");
                }
            } else if (menuChoice == 2) {
                System.out.println("\n Celsius\t\t Fahrenheit");
                System.out.println("=========\t\t============");
                for (int x = -100; x <= 100; x++) {
                    System.out.print("  " + x + "");
                    if (x == -100) {
                        System.out.print("\t\t\t");
                    } else {
                        System.out.print("\t\t\t\t");
                    }
                    System.out.print(String.format("%.1f", +CelsiusToFahrenheit(x)) + "");
                    System.out.println();
                }
            }
            nextOption = SafeInput.getYNConfirm(in,"Select another option? ");
        }while(nextOption);
    }
    public static double CelsiusToFahrenheit(double Celsius) {
        double Fahrenheit = 0;
        Fahrenheit = (Celsius * 1.8) + 32;

        return Fahrenheit;
    }
}