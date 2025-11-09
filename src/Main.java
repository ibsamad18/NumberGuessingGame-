import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 0;
        int max = 20;
        String plural;
        int randomNo = random.nextInt(min , max );

        System.out.println("....NUMBER GUESSING GAME....");
        System.out.println("Make a guess");
        do{
            System.out.print("Enter a random number: ");
            guess = scanner.nextInt();
            attempts++;
            plural = (attempts > 1)? "s" : "";

           if(guess > randomNo){
                System.out.println("That's higher than our random number");
            }
            else if (guess < randomNo) {
                System.out.println("That's lower than our random number");
            }

        }while (guess != randomNo);

        System.out.print("Hurray! you picked the correct number.");
        System.out.printf("You made %d attempts%s\n", attempts,plural);



        scanner.close();
    }
}
