import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 0;
        int max = 10;
        int randomNo = random.nextInt(min , max );

        System.out.println("....NUMBER GUESSING GAME....");
        System.out.println("Make a guess");
        do{
            System.out.print("Enter a random number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNo){
                System.out.println("That is higher than our special number");
            }
            else if (guess < randomNo) {
                System.out.println("That is lower than our special number");
            }

        }while (guess != randomNo);

        System.out.print("You have won!, you picked the correct number.");
        System.out.printf("You made %d attempts\n", attempts);



        scanner.close();
    }
}