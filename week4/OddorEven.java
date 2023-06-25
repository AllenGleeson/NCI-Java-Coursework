import javax.swing.JOptionPane;

public class OddorEven{
	public static void main(String[] args){
		//variables
		int num;
		//inputs
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		//compute
		if(num%2>0){
            JOptionPane.showMessageDialog(null,"It is an odd number.");
        }
        else{
            JOptionPane.showMessageDialog(null,"It is an even number.");
        }
	}
}