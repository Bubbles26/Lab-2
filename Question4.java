/**
 * Name: Mutsawashe Maraidza
 * Student ID: 24020134
 * Course: BSc Computer Science & Software Engineering
 */

import java.io.*;
import java.util.*;

public class Question4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter output = new FileWriter("results.txt");
        String name;
        int score;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter student name: ");
            name = input.nextLine();
            System.out.print("Enter student score: ");
            score = input.nextInt();
            input.nextLine();
            output.write(name + "," + score + "\n");
        }
        output.close();
        input.close();
    }
}