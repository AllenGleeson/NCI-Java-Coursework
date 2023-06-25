import javax.swing.JOptionPane;

public class personsage{
	public static void main(String[] args){
		/*Fill in the gaps in code by replacing the **** sections*/
		//addition
		int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		int year=Integer.parseInt(JOptionPane.showInputDialog(null,"What year is it?"));
		int ans=year-age;
		//print
		System.out.println("You were born in "+ans);
	}
}