import javax.swing.JOptionPane;

public class LeapApp{
	public static void main(String[] args){
		//variables
		int year;
        boolean leapOrNot;
		//objects
		LeapYear leapYear;
		leapYear=new LeapYear();
		//inputs
		year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a year: (YYYY)"));
		//set
		leapYear.setYear(year);
		//compute
		leapOrNot=leapYear.getYear();
		//output
        if(leapOrNot){
            JOptionPane.showMessageDialog(null,"It is a leap year!");
        }
		else{
            JOptionPane.showMessageDialog(null,"This isn't a leap year.");
        }
	}
}