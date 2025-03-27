import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Task 1 Declara o variabila int numarAscuns si salveaza in ea un numar oarecare de la 1 la 100
        // Task 2 Cere de la user sa ghiceasca numarul ascuns
        // Task 3 Daca numarul introdus de user este mare decat numarul ascuns afiseaza less daca e mai mic afiseaza more daca e egal afiseaza you guessed!

        // Update 1 Adauga o precedura care repeta intrebarea pana se ghiceste numarul.
        // Update 2 Adauga un numar random la numar ascuns.

        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the number:");
            int guessedNumber = scan.nextInt();

            if (guessedNumber < hiddenNumber) {
                System.out.println("More!");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less!");
            } else {
                System.out.println("You guessed the number!");
                break;
            }
        }
    }
}
