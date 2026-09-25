import java.util.Scanner;

public class classwork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        System.out.println("Welcome to the Adder!");
        System.out.println("This program adds all the numbers you enter.");
        System.out.println("When you have entered all your numbers, type S.");

        while (again) {

            int sum = 0;

            System.out.println("\nEnter a number (or S to finish):");

            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("S")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                    System.out.println("Enter another number (or S to finish):");
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer or S:");
                }
            }

            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to make a new calculation? (Y/N)");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("Y")) {
                again = false;
            }
        }

        System.out.println("Thank you for using the Adder!");
        scanner.close();
    }
}