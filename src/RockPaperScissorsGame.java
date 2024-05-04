import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(); // For New Line;
            System.out.println("choose : r for Rock : p for Paper : s for Scissors");
            System.out.println(); // For New Line;
            String userMove;

            while (true) {
                System.out.print("Enter Your Move : "); // Enter r || p || s;
                userMove = sc.nextLine(); // taking input for user.
                if (userMove.equals("r") || userMove.equals("p") || userMove.equals("s")) {
                    break;
                }
                System.out.println(userMove + " is not a valid move.");
            }
            System.out.println("Your move is : " + userMove);

            String[] rps = { "r", "p", "s" };
            String compMove = rps[new Random().nextInt(rps.length)]; // Taking computer move as Random.
            System.out.println("Computer move is : " + compMove);

            if (userMove.equals(compMove)) {
                System.out.println("Match Draw ! ");
            } else if (userMove.equals("r") && compMove.equals("p") || userMove.equals("p") && compMove.equals("s")
                    || userMove.equals("s") && compMove.equals("r")) {
                System.out.println("you Loose ! ");
            } else {
                System.out.println("you Win ! ");

            }
            System.out.println("Wanna play Again? (Y/N)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        sc.close();
    }
}