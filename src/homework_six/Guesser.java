package homework_six;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guesser {
    private static int computer() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    private static int readInt(Scanner scanner) {
        int x;
        while (true) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x < 0) {
                    System.out.println("Only positive");
                    scanner.nextLine();
                } else {
                    return x;
                }
            } else {
                System.out.println("Only positive number");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int hidden = Guesser.computer();

        System.out.println("Hello,user.\nLet's play a little game.I guessed a number in range 0-10.You'll have 3 tries to guess.");
        for (i = 0; i < 3; i++) {
            int found = Guesser.readInt(scan);
            if (hidden == found) {
                System.out.println("Congrats!");
                break;
            } else {
                System.out.println("Try again");
            }
        }

        if (i == 3) {
            System.out.println("Sorry,out of tries");
        }
    }
}