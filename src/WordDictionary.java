import java.util.Random;

public class WordDictionary {
    Random rand = new Random();
    private String randWord ="";
   // private char[] usedLetters;
    private char usedLettersIndex =0;

private String[] wordDictionary = {"dog", "vulcano", "summer"};


      char[]  usedLetters = new char[chooseWord(wordDictionary).length() + 10];


    public String[] getWordDictionary() {
        return wordDictionary;

    }

    public String chooseWord(String[] wordDictionary){
        int randomNumber = rand.nextInt(wordDictionary.length);
        return wordDictionary[randomNumber];
    }


    public void printWord() {
        for (char x : chooseWord(wordDictionary).toCharArray()) {
            if (isCharAlreadyUsed(x)) {
                System.out.print(x + " ");
            } else {
                System.out.print("* ");
            }

        }
        System.out.println();
    }

    public boolean isCharAlreadyUsed(char userGuess) {
        for (char x : usedLetters) {
            if (x == userGuess) {
                return true;
            }
        }
        return false;
    }

    public void addUserGuess(char guess) {
        usedLetters[usedLettersIndex] = guess;
        usedLettersIndex++;

    }

    public boolean isPlayerWin() {
        for (char x : chooseWord(wordDictionary).toCharArray()) {
            if (!isCharAlreadyUsed(x)) {
                return false;


            }
        }
        return true;
    }

    public boolean isCharInSecretWord(char userGuess) {
        return chooseWord(wordDictionary).contains(Character.toString(userGuess));
    }

}
