/*
 * Name: Mutsawashe Maraidza
 * Student ID: 24020134
 * Course: BSc Computer Science & Software Engineering
 */
import java.io.*;
import java.util.*;

public class Question7 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("numbers.txt"));
        FileWriter output = new FileWriter("stats.txt");

        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        double average;

        while (input.hasNextInt()) {
            number = input.nextInt();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
            sum = sum + number;
            count++;
        }

        average = (double) sum / count;

        output.write("Smallest: " + smallest + "\n");
        output.write("Largest: " + largest + "\n");
        output.write("Average: " + average + "\n");

        input.close();
        output.close();
    }
}