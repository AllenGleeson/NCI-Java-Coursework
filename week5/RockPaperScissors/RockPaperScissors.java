import javax.swing.*;

public class RockPaperScissors{
    String[] options;
    int randNum;
    int choice;
    
    public RockPaperScissors() {
        options = new String[]{"Rock", "Paper", "Scissors"};
        
    }
    
    public void playGame() {
        randNum = (int) ((Math.random() * (2 - 0)) + 0);
        choice = JOptionPane.showOptionDialog(null, "Lets play the game!",
            "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

            if(randNum==choice){
                JOptionPane.showMessageDialog(null,"It's a tie! Computer: "+options[randNum]+" User: "+options[choice]);
            }
            else if(options[choice]==options[0]){
                if(options[randNum]==options[1]){
                    JOptionPane.showMessageDialog(null,"Sorry you lose this time. You chose: "
                    +options[choice]+" and the computer chose: "+options[randNum]);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You win!");
                }
            }
            else if(options[choice]==options[1]){
                if(options[randNum]==options[2]){
                    JOptionPane.showMessageDialog(null,"Sorry you lose this time. You chose: "
                    +options[choice]+" and the computer chose: "+options[randNum]);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You win!");
                }
            }
            else{
                if(options[randNum]==options[0]){
                    JOptionPane.showMessageDialog(null,"Sorry you lose this time. You chose: "
                    +options[choice]+" and the computer chose: "+options[randNum]);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You win!");
                }
            }
    }  
}