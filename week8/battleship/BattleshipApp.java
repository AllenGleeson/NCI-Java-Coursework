import javax.swing.JOptionPane;

public class BattleshipApp {
    public static void main(String[] args){
        Battleship battleship = new Battleship();
        boolean play = true;
        String [] options = {"Yes", "No"};
        int choice = 0;

        while(play){
            String userGrid = JOptionPane.showInputDialog("Lets play! Please choose a grid. A, B, C, 1, 2, 3 eg. A2");
            String userGridArr[] = userGrid.split("");
            if (isNumeric(userGridArr[0])) {
                JOptionPane.showMessageDialog(null,"String isn't numeric.");
            }
            else {
                battleship.userShipGrid(userGridArr[0].toLowerCase(), Integer.parseInt(userGridArr[1]));
                battleship.computerShipGrid();
                String userFire = JOptionPane.showInputDialog("Choose a grid to shoot at: A, B, C, 1, 2, 3 eg. A2");
                String userFireArr[] = userFire.split("");
                if(isNumeric(userFireArr[0])){
                    JOptionPane.showMessageDialog(null,"String isn't numeric.");
                }
                else {
                    if(battleship.userFire(userFireArr[0].toLowerCase(), Integer.parseInt(userFireArr[1]))){
                        JOptionPane.showMessageDialog(null,"Hit! The enemy ship has been destroyed.");
                        choice = JOptionPane.showOptionDialog(null, "Would you like another round?",
                        "Click a button",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
                        if(choice==0){
                            battleship.resetGame();
                        }
                        else{
                            play = false;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Miss! The enemy ship is still there and about to take a shot at you!");
                        if(battleship.computerFire()){
                            JOptionPane.showMessageDialog(null,"You were hit!");
                            choice = JOptionPane.showOptionDialog(null, "Would you like another round?",
                            "Click a button",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
                            if(choice==0){
                                battleship.resetGame();
                            }
                            else{
                                play = false;
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Computer missed! Another chance to get their ship.");
                        }
                        battleship.resetGame();
                    }
                }
            }
        }
	}

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}