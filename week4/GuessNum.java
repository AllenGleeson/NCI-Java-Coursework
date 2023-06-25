import javax.swing.JOptionPane;

public class GuessNum{
	public static void main(String[] args){
		//variables
		int num;
        int randNum;

		for (int i = 0; i < 3; i++) {
			//inputs
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
			//compute
			randNum = (int)Math.floor(Math.random() * (5 - 1 + 1) + 1);
			if(num==randNum){
				JOptionPane.showMessageDialog(null,"Good job! You guessed correctly!"+"num:"+num+" rand:"+randNum+" Attempt Number: "+(i+1));
				break;
			}
			else{
				JOptionPane.showMessageDialog(null,"Oops, not this time. You entered: "+num+" and the computer chose: "+randNum+" Attempt Number: "+(i+1));
			}
		}
	}
}