public class Judge {

    private int lifepoints = 5;
    // SecretWord secretWord = new SecretWord("cat");


    public int looseLifePoints() {
        lifepoints--;
        System.out.println("You have " + lifepoints + " lifepoints");
        return lifepoints;
    }

    public boolean isPlayerLoose() {
        if (lifepoints == 0) {
            System.out.println("You Hang Yourself!");

        }
        return lifepoints <= 0;
    }

//    public boolean isPlayerWin() {
//        for (char x : secretWord.getSecretWord().toCharArray()) {
//            if (!secretWord.isCharAlreadyUsed(x)) {
//
//
//                return false;
//            }
//
//        }
//        return true;
//    }


}
