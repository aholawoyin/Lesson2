


import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of Nigeria?");
        System.out.println("A) Lagos");
        System.out.println("B) Abuja");
        System.out.println("C) London");
        System.out.println("D) Ibadan");
        System.out.print("Enter your answer (A/B/C/D): ");
        String answer1 = scanner.next();
        if (answer1.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is B) Abuja.");
        }

        // Question 2
        System.out.println("Question 2: Which planet is known as the 'Red Planet'?");
        System.out.println("A) Earth");
        System.out.println("B) Mars");
        System.out.println("C) Jupiter");
        System.out.println("D) Saturn");
        System.out.print("Enter your answer (A/B/C/D): ");
        String answer2 = scanner.next();
        if (answer2.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is B) Mars.");
        }

        // Question 3
        System.out.println("Question 3: Who painted the famous artwork 'The Starry Night'?");
        System.out.println("A) Leonardo da Vinci");
        System.out.println("B) Vincent van Gogh");
        System.out.println("C) Pablo Picasso");
        System.out.println("D) Claude Monet");
        System.out.print("Enter your answer (A/B/C/D): ");
        String answer3 = scanner.next();
        if (answer3.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is B) Vincent van Gogh.");

        }
    }
}
