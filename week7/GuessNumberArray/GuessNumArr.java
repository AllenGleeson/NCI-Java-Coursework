
import javax.swing.JOptionPane;

public class GuessNumArr{
	public static void main(String[] args){
        RandArryGuessGame game = new RandArryGuessGame();
        int guess = 0;
        boolean playGame = true;
        while(playGame){
            if(JOptionPane.showInputDialog(null,"Would you like to play the game? Y/N").toLowerCase().equals("y")){
                game.createRandArr();
                try {
                    guess=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to see how many times it appears in the array:"));
                    game.setGuess(guess);
                    game.numberCount();
                    JOptionPane.showMessageDialog(null,"The number "+guess+" was in the array "+game.getCount()+" times.");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Sorry this is not a number.");
                }
            }
            else{
                playGame=false;
            }
        }
	}
}