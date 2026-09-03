/** Name: Mutsawashe Maraidza
* Student ID: 24020134
* Course: BSc Computer Science & Software Engineering
*/

import java.util.Scanner; //the Scanner

public class Question2 {  //create a file
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //create Scanner

        System.out.print("Enter your full name: ");
        String name = input.nextLine();    //read the name

        System.out.print("Enter a letter: ");
        String letter = input.nextLine(); //read the letter

        //String methods
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Starts with letter: " + name.toLowerCase().startsWith(letter.toLowerCase()));
    }
}