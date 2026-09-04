/*
 * Name: Mutsawashe Maraidza
 * Student ID: 24020134
 * Course: BSc Computer Science & Software Engineering
 */

import java.io.*;
import java.util.*;

public class Question5 {

    public static void main(String[] args) throws IOException {

        // Read from students.txt
        Scanner input = new Scanner(new File("students.txt"));

        // Create grades.txt to store the results
        FileWriter output = new FileWriter("grades.txt");

        // Declare variables
        String name;
        int score;
        String grade;

        // Read the file while there are more students
        while (input.hasNextLine()) {

            // Read one line from the file
            String line = input.nextLine();

            // Split the name and score using the comma
            String[] data = line.split(",");

            // Get the name
            name = data[0];

            // Get the score
            score = Integer.parseInt(data[1]);

            // Work out the student's grade
            if (score >= 80) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Write name, score and grade to grades.txt
            output.write(name + "," + score + "," + grade + "\n");
        }

        // Close the input file
        input.close();

        // Close the output file
        output.close();
    }
}