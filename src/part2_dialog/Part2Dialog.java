package part2_dialog;

import java.util.Scanner;

public class Part2Dialog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Part 2. Simple dialog with loop
        String continueAnswer;

        do {
            System.out.print("Enter any string: ");
            String text = scanner.nextLine();

            System.out.println("Uppercase: " + text.toUpperCase());

            System.out.print("Do you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

            System.out.println();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Program finished.");

        scanner.close();
    }
}