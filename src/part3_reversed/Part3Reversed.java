package part3_reversed;

import java.util.Scanner;

public class Part3Reversed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Part 3. Improved dialog with loop
        String continueAnswer;

        do {
            System.out.print("Enter any string: ");
            String text = scanner.nextLine();

            System.out.print("Reversed string: ");

            // Reverse the string using for loop and charAt()
            for (int index = text.length() - 1; index >= 0; index--) {
                System.out.print(text.charAt(index));
            }

            System.out.println();

            System.out.print("Do you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

            System.out.println();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Program finished.");

        scanner.close();
    }
}