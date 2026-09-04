 /*
  * Name: Mutsawashe Maraidza
  * Student ID: 24020134
  * Course: BSc Computer Science & Software Engineering
  */

import java.io.*;
import java.util.*;

public class Question9 {
    public static void main(String[] args) throws IOException {

        // Read numbers from numbers.txt
        Scanner input = new Scanner(new File("numbers.txt"));

        // Create signs.txt
        FileWriter output = new FileWriter("signs.txt");

        // Declare variables
        int number;
        int positiveTotal = 0;
        int negativeTotal = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        // Read every number
        while (input.hasNextInt()) {

            number = input.nextInt();

            // Check if the number is positive
            if (number > 0) {
                positiveTotal = positiveTotal + number;
                positiveCount++;
            }

            // Check if the number is negative
            else if (number < 0) {
                negativeTotal = negativeTotal + number;
                negativeCount++;
            }
        }

        // Write the results to the file
        output.write("Positive total: " + positiveTotal + "\n");
        output.write("Positive count: " + positiveCount + "\n");
        output.write("Negative total: " + negativeTotal + "\n");
        output.write("Negative count: " + negativeCount + "\n");

        // Close the files
        input.close();
        output.close();
    }
}