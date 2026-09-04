 /*
  * Name: Mutsawashe Maraidza
  * Student ID: 24020134
  * Course: BSc Computer Science & Software Engineering
  */

import java.io.*;
import java.util.*;

public class Question10 {
    public static void main(String[] args) throws IOException {

        // Read numbers from numbers.txt
        Scanner input = new Scanner(new File("numbers.txt"));

        // Scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        int searchNumber;
        int number;
        boolean found = false;

        // Ask the user for a number
        System.out.print("Enter a number to search for: ");
        searchNumber = keyboard.nextInt();

        // Search through the file
        while (input.hasNextInt()) {

            number = input.nextInt();

            // Check if the number matches
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        // Print the result
        System.out.println(found);

        // Close the scanners
        input.close();
        keyboard.close();
    }
}