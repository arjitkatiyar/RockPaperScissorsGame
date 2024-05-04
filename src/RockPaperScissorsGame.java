import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        System.out.println();                       // For New Line;
        System.out.println("0 for Rock : 1 for Paper : 2 for Scissors");
        System.out.println();                       // For New Line;

        System.out.print("Enter Your Move : ");    //Enter zero || one || two;
        Scanner sc = new Scanner(System.in);

        int userMove = sc.nextInt();              //taking input for user.
        System.out.println("Your move is : " + userMove);

        Random rm = new Random();
        int compMove = rm.nextInt(3);      //Taking computer move as Random.
        System.out.println("Computer move is : " + compMove);

        if (userMove == compMove){
            System.out.println("Match Draw ! ... Play Again");
        } else if (userMove == 0 && compMove == 1 || userMove == 1 && compMove == 2 || userMove == 2 && compMove == 0) {
            System.out.println("you Loose ! ... play Again");
        }
        else {
            System.out.println("you Win ! ... play Again");

        }
    }
}