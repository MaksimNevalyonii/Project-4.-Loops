package classwork;

import java.util.Scanner;

public class Part4Project {

    // Scanner is shared by all methods
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        // Main menu loop
        while (running) {

            showMenu();

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {

                case 1:
                    part1Syntax();
                    running = askReturnToMenu();
                    break;

                case 2:
                    part2SimpleDialog();
                    running = askReturnToMenu();
                    break;

                case 3:
                    part3ReversedString();
                    running = askReturnToMenu();
                    break;

                case 4:
                    part4GameRecommendation();
                    running = askReturnToMenu();
                    break;

                case 5:
                    System.out.println("\nThank you for using the program!");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid choice. Please choose 1-5.");
            }

            System.out.println();
        }

        scanner.close();
    }

    // ==========================================
    // MAIN MENU
    // ==========================================

    // Menu method
    public static void showMenu() {

        System.out.println("==========================================");
        System.out.println("             JAVA PROJECT 4");
        System.out.println("==========================================");
        System.out.println("1. Part 1 - Syntax");
        System.out.println("2. Part 2 - Simple Dialog");
        System.out.println("3. Part 3 - Reversed String");
        System.out.println("4. Part 4 - Game Recommendation");
        System.out.println("5. Exit");
        System.out.println("==========================================");
    }

    // ==========================================
    // PART 1
    // ==========================================

    // Part 1. Syntax
    public static void part1Syntax() {

        System.out.println("\n==========================================");
        System.out.println("              PART 1. SYNTAX");
        System.out.println("==========================================");

        // Part 1.1. While loop
        System.out.println("\nPart 1.1. While loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Part 1.2. Do while loop
        System.out.println("\nPart 1.2. Do while loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // Part 1.3.1. For loop with increment
        System.out.println("\nPart 1.3.1. For loop with increment:");

        for (int number = 1; number <= 10; number++) {
            System.out.print(number + " ");
        }

        System.out.println();

        // Part 1.3.2. For loop with decrement
        System.out.println("\nPart 1.3.2. For loop with decrement:");

        for (int number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println();

        // Part 1.4. Iterate through String
        System.out.println("\nPart 1.4. Iterate through String:");

        String text = "Java";

        for (int index = 0; index < text.length(); index++) {
            System.out.println(text.charAt(index));
        }

        // Part 1.5. Nested loop
        System.out.println("\nPart 1.5. Nested loop:");

        for (int outer = 1; outer <= 3; outer++) {

            System.out.println("Outer loop: " + outer);

            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("  Inner loop: " + inner);
            }
        }
    }

    // ==========================================
    // PART 2
    // ==========================================

    // Part 2. Simple dialog with loop
    public static void part2SimpleDialog() {

        System.out.println("\n==========================================");
        System.out.println("        PART 2. SIMPLE DIALOG");
        System.out.println("==========================================");

        String continueAnswer;

        do {

            // Part 2.1. Input String
            System.out.print("\nEnter any string: ");
            String text = scanner.nextLine();

            // Part 2.2. Convert String to uppercase
            System.out.println("Uppercase: " + text.toUpperCase());

            // Part 2.3. Ask user to continue
            System.out.print("Do you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Part 2 finished.");
    }

    // ==========================================
    // PART 3
    // ==========================================

    // Part 3. Improved dialog with reversed String
    public static void part3ReversedString() {

        System.out.println("\n==========================================");
        System.out.println("       PART 3. REVERSED STRING");
        System.out.println("==========================================");

        String continueAnswer;

        do {

            // Part 3.1. Input String
            System.out.print("\nEnter any string: ");
            String text = scanner.nextLine();

            // Part 3.2. Reverse String using for loop and charAt()
            System.out.print("Reversed string: ");

            for (int index = text.length() - 1; index >= 0; index--) {
                System.out.print(text.charAt(index));
            }

            System.out.println();

            // Part 3.3. Ask user to continue
            System.out.print("Do you want to continue? (Y/N): ");
            continueAnswer = scanner.nextLine();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Part 3 finished.");
    }

    // ==========================================
    // PART 4
    // ==========================================

    // Part 4. Game Recommendation
    public static void part4GameRecommendation() {

        System.out.println("\n==========================================");
        System.out.println("       PART 4. GAME RECOMMENDATION");
        System.out.println("==========================================");

        String continueAnswer;

        // Part 4.1. Put previous Project 3.3 into loop
        do {

            // Part 4.2. User Information
            System.out.println("\nWelcome to the Game Recommendation System!");

            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.print("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            System.out.print("What type of game do you like? ");
            String genre = scanner.nextLine();

            System.out.println("\nHello, " + name + "!");
            System.out.println("Here is my recommendation:");

            // Part 4.3. Recommendations
            if (age >= 13 && age <= 16) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println(
                            "I recommend Spider-Man: Miles Morales."
                    );

                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend Minecraft.");

                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println("I recommend Forza Horizon 5.");

                } else {
                    System.out.println("I recommend Dota 2.");
                }

            } else if (age >= 17 && age <= 25) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println(
                            "I recommend Red Dead Redemption 2."
                    );

                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend The Witcher 3.");

                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println("I recommend Forza Horizon 5.");

                } else {
                    System.out.println("I recommend GTA V.");
                }

            } else if (age > 25) {

                if (genre.equalsIgnoreCase("action")) {
                    System.out.println(
                            "I recommend Red Dead Redemption 2."
                    );

                } else if (genre.equalsIgnoreCase("rpg")) {
                    System.out.println("I recommend The Witcher 3.");

                } else if (genre.equalsIgnoreCase("racing")) {
                    System.out.println(
                            "I recommend Euro Truck Simulator 2."
                    );

                } else {
                    System.out.println("I recommend osu!");
                }

            } else {
                System.out.println("I recommend Minecraft for you.");
            }

            System.out.println("Enjoy your game, " + name + "!");

            // Part 4.4. Ask whether to repeat the conversation
            System.out.print("\nDo you want to repeat the conversation? (Y/N): ");
            continueAnswer = scanner.nextLine();

        } while (continueAnswer.equalsIgnoreCase("y"));

        System.out.println("Part 4 finished.");
    }

    // ==========================================
    // RETURN TO MENU
    // ==========================================

    // Ask user whether to return to the main menu
    public static boolean askReturnToMenu() {

        System.out.print("\nReturn to main menu? (Y/N): ");

        String answer = scanner.nextLine();

        return answer.equalsIgnoreCase("y");
    }
}