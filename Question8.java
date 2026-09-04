 /*
  * Name: Mutsawashe Maraidza
  * Student ID: 24020134
  * Course: BSc Computer Science & Software Engineering
  */

import java.io.*;
import java.util.*;

public class Question8 {
    public static void main(String[] args) throws IOException {

        // Read numbers from numbers.txt
        Scanner input = new Scanner(new File("numbers.txt"));

        // Create evenodd.txt
        FileWriter output = new FileWriter("evenodd.txt");

        // Declare variables
        int number;
        int even = 0;
        int odd = 0;

        // Read every number
        while (input.hasNextInt()) {

            number = input.nextInt();

            // Check if the number is even
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Write the results to the file
        output.write("Even numbers: " + even + "\n");
        output.write("Odd numbers: " + odd + "\n");

        // Close the files
        input.close();
        output.close();
    }
}