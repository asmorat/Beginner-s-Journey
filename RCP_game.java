import java.util.*;

public class RCP_game {
    public static void putInfo(int a){
        if (a == 0) {
            System.out.println("Computer choose: Rock");
        } else if (a == 1) {
            System.out.println("Computer choose: Paper");
        } else {

            System.out.println("Computer choose: Scissors");
        }
    }
    
    public static void getResult(int a,int b){
        if (a == b) {
            System.out.println("Draw !!!");
        } else if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
            System.out.println("You Win !!!");
        } else {
            System.out.println("Computer Win !!!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Let's play rock-paper-scissors with computer...\n");
        System.out.println("Rock     --> 0\nPaper    --> 1\nscissors --> 2\n");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice < 0 || choice > 2) {
            System.out.println("Invalid choice. Please enter a number between 0 and 2.\n");
            continue;
            }

            Random ci = new Random();
            int computerInput = ci.nextInt(3);
            putInfo(computerInput);
            getResult(computerInput,choice);
            System.out.println();

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
            System.out.println();

        }
        System.out.println("Thank you for playing! Goodbye.");
        sc.close();

    }
}
