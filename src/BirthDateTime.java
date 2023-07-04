import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        int year = 0;
        int day = 0;
        int month = 0;
        int hour = 0;
        int minutes = 0;
        int upperDaysLimit = 0;
        // Get user input and call function
        year = SafeInput.getRangedInt(in, "\nEnter the year you were born: ", 1980, 2020);
        month = SafeInput.getRangedInt(in,"Enter the month you were born: ", 1,12);
        //Switch to determine max days in a month
        switch (month) {
            case 1,3,5,7,8,10,12:
                upperDaysLimit = 31;
                break;
            case 2: {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    upperDaysLimit = 29;
                else
                    upperDaysLimit = 28;
            }
            break;
            case 4, 6, 9, 11:
                upperDaysLimit = 30;
                break;
        }
        day = SafeInput.getRangedInt(in,"Enter the day your were born: ",1, upperDaysLimit);
        hour = SafeInput.getRangedInt(in,"Enter the hour you were born: ", 1, 24);
        minutes = SafeInput.getRangedInt(in,"Enter the minute you were born: ",1, 59);
        //Output the Results
        System.out.println("]\nYou were born on: " + month + "/" + day + "/" + year + ", at " +hour + ":" + minutes);

    }
}