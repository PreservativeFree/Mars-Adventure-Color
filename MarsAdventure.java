import java.util.Scanner;

public class MarsAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What planet are you headed to?");
        String planet = input.nextLine();
        System.out.println("I see, my readings indicate that " + planet + " is surrounded by 3 stars. " +
                "When you left the space academy what rank were you\nafforded to by Space Command?");
        String rank = input.nextLine();
        System.out.println(rank + "? You were assigned rank of " + rank + "? " + "Incredible, we don't see many of those these days!");
        System.out.println("Perhaps you can tell me your space suit color preference?");
        String spaceSuitColor = input.nextLine();
        System.out.println("Our systems indicate you selected " + spaceSuitColor + "! We'll have that ready for you soon, " + rank + ".");
        System.out.println("What ship will you be taking on this expedition?");
        String shipSelect = input.nextLine();
        System.out.println("I see you have picked a Class IX " + shipSelect + ". Great choice!");
        System.out.println("This ship can be customized with at least 8 HyperBoosters! Can you tell\nme " +
                "how many space boosters you would like to add to your " + shipSelect + "?");
        String boosterAmount = input.nextLine();
        System.out.println("Excellent ! With " + boosterAmount + " boosters, You'll be cruising in HyperSpeed in no time!");
    }
}
