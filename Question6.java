 /*
  * Name: Mutsawashe Maraidza
  * Student ID: 24020134
  * Course: BSc Computer Science & Software Engineering
  */

import java.util.*;

public class Question6 {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare variable
        int day;

        // Ask the user to enter a day number
        System.out.print("Enter a number from 1 to 7: ");
        day = input.nextInt();

        // Use switch to find the day
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number. Please enter a number from 1 to 7.");
        }

        input.close();
    }
}
