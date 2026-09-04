import java.io.*;
import java.util.*;

public class Question3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new FileReader("students.txt"));

        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

        input.close();
    }
}

