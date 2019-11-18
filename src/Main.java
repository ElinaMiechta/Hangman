import java.util.Scanner;

public class Main {
    final static String NEW_GAME = "START THE GAME";
    final static String EXIT = "QUIT THE GAME";


    public static void main(String[] args) {
        Menu menu = new Menu(NEW_GAME, EXIT);
        SecretWord secretWord = new SecretWord();
        Game game = new Game();



        switch (menu.printMenuAndChoose()) {
            case NEW_GAME:
                System.out.println("You have 5 lifepoints, 1 BIG hint and ONE word! Lets start!");
                System.out.println("In case you need  a hint: print '?' to see one. ");
                System.out.println("Good luck!");


                secretWord.printWord();
                System.out.println("Type 1 letter:");


                game.game_start();


                break;

            case EXIT:
                System.out.println("Are you sure? 1. - yes, exit; 2. - no, continue");
                Scanner scan = new Scanner(System.in);
                int decision = scan.nextInt();
                switch (decision) {
                    case 1:
                        System.out.println("Bye-bye");
                        System.exit(0);
                    case 2:
                        menu.printMenuAndChoose();
                }


        }
    }


}





