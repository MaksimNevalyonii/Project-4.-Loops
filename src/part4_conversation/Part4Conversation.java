package part4_conversation;

import java.util.Scanner;

public class Part4Conversation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continueAnswer;

        // Part 4. Put previous Project 3.3 into loop
        do {

            // Part 4.1. User Information
            System.out.println("Welcome to the Game Recommendation System!");

            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.print("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            System.out.print("What type of game do you like? ");
            String genre = scanner.nextLine();

            System.out.println("\nHello, " + name + "! Here is my recommendation:");

            // Part 4.2. Recommendations
            if (age >= 13 && age <= 16) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println("I recommend Spider-Man: Miles Morales.");
                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend Minecraft.");
                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println("I recommend Forza Horizon 5.");
                } else {
                    System.out.println("I recommend Dota 2.");
                }

            } else if (age >= 17 && age <= 25) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println("I recommend Red Dead Redemption 2.");
                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend The Witcher 3.");
                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println("I recommend Forza Horizon 5.");
                } else {
                    System.out.println("I recommend GTA V.");
                }

            } else if (age > 25) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println("I recommend Red Dead Redemption 2.");
                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend The Witcher 3.");
                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println("I recommend Euro Truck Simulator 2.");
                } else {
                    System.out.println("I recommend osu!");
                }

            } else {
                System.out.println("I recommend Minecraft for you.");
            }

            System.out.println("Enjoy your game, " + name + "!");

            // Part 4.3. Ask if user wants to repeat the conversation
            System.out.print("\nDo you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

            System.out.println();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the Game Recommendation System!");

        scanner.close();
    }
}