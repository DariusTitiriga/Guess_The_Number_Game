import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Task 1 Declara o variabila int numarAscuns si salveaza in ea un numar oarecare de la 1 la 100
        // Task 2 Cere de la user sa ghiceasca numarul ascuns
        // Task 3 Daca numarul introdus de user este mare decat numarul ascuns afiseaza less daca e mai mic afiseaza more daca e egal afiseaza you guessed!

        // Update 1 Adauga o precedura care repeta intrebarea pana se ghiceste numarul.
        // Update 2 Adauga un numar random la numar ascuns.
        // Update 3 Adauga o functionalitate care numara incercarile si afiseaza la final din cate sa ghicit.
        // Update 4 Adauga un sistem de vieti 8, care scade de fiecare data cand nu ghicesti numarul. Cand ajunge la 0 afiseaza "Game over!" si opreste jocul.

        int counter = 0;
        int lives = 8;
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the number:");
            int guessedNumber = scan.nextInt();
            counter++; // Counter += 1; sau counter = counter + 1; Incrementare

            if (guessedNumber < hiddenNumber) {
                System.out.println("More!");
                lives--;
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less!");
                lives--;
            } else {
                System.out.println("You guessed the number! You used " + counter + " attempts!");
                break;
            }

            if (lives == 0){
                System.out.println("Game over! The number was " + hiddenNumber);
                break;
            }
        }
    }
}
