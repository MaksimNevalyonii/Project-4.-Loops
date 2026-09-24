package part1_syntax;

public class Part1Syntax {

    public static void main(String[] args) {

        // Part 1.1. While loop
        System.out.println("Part 1.1. While loop:");

        int i = 1;

        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        // Part 1.2. Do while loop
        System.out.println("Part 1.2. Do while loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 3);

        System.out.println();

        // Part 1.3.1. For loop with increment
        System.out.println("Part 1.3.1. For loop with increment:");

        for (int number = 1; number <= 10; number++) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();

        // Part 1.3.2. For loop with decrement
        System.out.println("Part 1.3.2. For loop with decrement:");

        for (int number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();

        // Part 1.4. Iterate through String
        System.out.println("Part 1.4. Iterate through String:");

        String text = "Java";

        for (int index = 0; index < text.length(); index++) {
            System.out.println(text.charAt(index));
        }

        System.out.println();

        // Part 1.5. Nested loop
        System.out.println("Part 1.5. Nested loop:");

        for (int outer = 1; outer <= 3; outer++) {

            System.out.println("Outer loop: " + outer);

            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("  Inner loop: " + inner);
            }
        }
    }
}