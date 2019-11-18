import java.util.Scanner;

public class SecretWord {
    Hint hint = new Hint();
    //private char[] usedLetters;
    private char usedLettersIndex = 0;


    private String words[] = {"dogs", "vulcano", "summer"};

    public String getWords() {
        return words[0];
    }


    public char userGuess() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().charAt(0);
    }


    char usedLetters[] = new char[getWords().length() + 10];


    public void addUserGuess(char guess) {
        usedLetters[usedLettersIndex] = guess;
        usedLettersIndex++;

    }

    public boolean isCharAlreadyUsed(char userGuess) {
        for (char x : usedLetters) {
            if (x == userGuess) {
                return true;
            }
        }
        return false;
    }

    public void printWord() {
        for (char x : getWords().toCharArray()) {
            if (isCharAlreadyUsed(x)) {
                System.out.print(x + " ");
            } else {
                System.out.print("* ");
            }

        }
        System.out.println();
    }

    public boolean isCharInSecretWord(char userGuess) {
        return this.getWords().contains(Character.toString(userGuess));
    }


    public boolean isPlayerWin() {
        for (char x : getWords().toCharArray()) {
            if (!isCharAlreadyUsed(x)) {
                return false;


            }
        }
        return true;
    }

}
