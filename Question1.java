import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        String grade;

        if (score < 0 || score > 100)
            grade = "Invalid score";
        else if (score >= 80)
            grade = "A";
        else if (score >= 70)
            grade = "B";
        else if (score >= 60)
            grade = "C";
        else if (score >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Grade: " + grade);

        input.close();
    }
}