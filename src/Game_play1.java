import java.util.Scanner;

public class Game_play1 {
    private SecretWord secretWord = new SecretWord();
    Judge judge = new Judge();
    WordDictionary wordDictionary = new WordDictionary();

    public char userGuess() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().charAt(0);
    }


    public void game_start() {
        do {
            wordDictionary.printWord();
            char userGuess = userGuess();
            wordDictionary.addUserGuess(userGuess);




            if (wordDictionary.isCharInSecretWord(userGuess)) {
                System.out.println("Good choice!");

                continue;
            } else {
                System.out.println("Wrong!");
                judge.looseLifePoints();
            }

            if (judge.isPlayerLoose()) {
                System.out.println();
                System.out.println("!!GAME OVER!!");
                break;
            }



        } while (true);
    }


}


