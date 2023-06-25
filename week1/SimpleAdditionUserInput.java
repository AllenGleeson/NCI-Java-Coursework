import javax.swing.JOptionPane;

public class SimpleAdditionUserInput{
	public static void main(String[] args){
		//addition
		int x= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:"));
		int y= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a second number:"));
		int ans=x+y;
		//print
		System.out.println("Your numbers together are: "+ans);
	}
}