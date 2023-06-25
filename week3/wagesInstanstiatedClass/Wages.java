public class Wages {

    private int monthlyWages;
    private int weeklyHours;
    private int yearlyWages;
    private int weeklyWages;

    public Wages() {
        monthlyWages = 0;
        weeklyHours = 0;
        yearlyWages = 0;
        weeklyWages = 0;
    }

    public void setMonthlyWages(int monthlyWages) {
        this.monthlyWages = monthlyWages;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }
	//compute
	public void calculateYearly(){
		yearlyWages = monthlyWages*12;
	}
	public void calculateWeekly(){
		weeklyWages = monthlyWages/(weeklyHours*4);
	}
	//get
	public int getYearlyWages(){
		return yearlyWages;
	}
	public int getWeeklyWages(){
		return weeklyWages;
	}
}
