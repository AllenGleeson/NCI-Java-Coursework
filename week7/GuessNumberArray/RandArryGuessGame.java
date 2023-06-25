public class RandArryGuessGame {
    private int guess;
    private int [] guessArray;
    private int count;

    public RandArryGuessGame(int guess) {
        this.guess = guess;
    }

    public RandArryGuessGame() {
        this.guess = 0;
        this.guessArray = new int [10];
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public void createRandArr() {
        this.count = 0;
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
        }
    }

    public void numberCount() {
        for (int i = 0; i < guessArray.length; i++) {
            if(guessArray[i] == guess){
                count= count+1;
            }
        }
    }
}
