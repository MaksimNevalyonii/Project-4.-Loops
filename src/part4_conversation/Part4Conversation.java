package part4_conversation;

import java.util.Scanner;

public class Part4Conversation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Part 4. Put previous Project 3.3 into loop
        String continueAnswer;

        do {

            // Part 4.1. Previous Project 3.3 conversation
            // Put your complete Project 3.3 code here.
            System.out.println("=== Improved Conversation ===");

            System.out.print("Hello! What is your name? ");
            String name = scanner.nextLine();

            System.out.println("Nice to meet you, " + name + "!");

            System.out.print("How are you today? ");
            String answer = scanner.nextLine();

            System.out.println("Thank you for your answer, " + name + "!");
            System.out.println("You said: " + answer);

            // Part 4.2. Ask whether to repeat the conversation
            System.out.print("Do you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

            System.out.println();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Conversation finished.");

        scanner.close();
    }
}