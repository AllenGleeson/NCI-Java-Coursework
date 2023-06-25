import javax.swing.JOptionPane;

public class WagesApp{
	public static void main(String[] args){
		//Take inputs
		int monthlyWages= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Monthly wages:"));
		int weeklyHours= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Weekly hours:"));
		Wages wages;
		wages = new Wages();

		//Calculation
		wages.setMonthlyWages(monthlyWages);
		wages.setWeeklyHours(weeklyHours);
		wages.calculateYearly();
		wages.calculateWeekly();
		int yearlyWages = wages.getYearlyWages();
        int weeklyWages = wages.getWeeklyWages();
		
		//print
		System.out.println("Your yearly wages are: "+yearlyWages + " and your weekly wages are: "+weeklyWages);
	}
}