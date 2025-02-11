import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean playAgain = true;

while (playAgain) {
    String playerAMove = userInput(scanner, "Player A, enter your move (R/P/S): ");
    String playerBMove = userInput(scanner, "Player B, enter your move (R/P/S): ");
    String result = determineWinner(playerAMove, playerBMove);
            System.out.println(result);
            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase().charAt(0) == 'Y';
        }
        scanner.close();
    }


    static String userInput(Scanner scanner, String prompt) {
        String move;
        do {
            System.out.print(prompt);
            move = scanner.nextLine().toUpperCase();
        } while (!move.equals("R") && !move.equals("P") && !move.equals("S"));
        return move;
    }


    static String determineWinner(String playerA, String playerB) {
        if (playerA.equals(playerB)) {
            return "It's a tie!";
        } else if ((playerA.equals("R") && playerB.equals("S")) ||
                (playerA.equals("P") && playerB.equals("R")) ||
                (playerA.equals("S") && playerB.equals("P"))) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}