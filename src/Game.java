public class Game {
    private SecretWord secretWord = new SecretWord();
    Judge judge = new Judge();
    Hint hint = new Hint();


    public void game_start() {
        do {
            secretWord.printWord();
            char userGuess = secretWord.userGuess();
            secretWord.addUserGuess(userGuess);

            if (userGuess == '?') {
                System.out.println("HINT");

                continue;
            }


            if (secretWord.isPlayerWin()) {
                System.out.println("Super, you Won!");
                break;
            }

            if (secretWord.isCharInSecretWord(userGuess)) {
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


        } while (!judge.isPlayerLoose() || !secretWord.isPlayerWin());

    }


}

