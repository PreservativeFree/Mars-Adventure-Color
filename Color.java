import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite color?");

        String color = input.nextLine();  // Get user input
        System.out.println("Nice, I like " + color + " too!!");
    }
}