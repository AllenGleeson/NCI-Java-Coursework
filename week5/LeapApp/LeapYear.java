public class LeapYear{
	//vars
	private int year;
	//set
	public void setYear(int year){
		this.year=year;
	}
	//compute
	public boolean getYear(){
        if(this.year%4==0){
            if((this.year%100==0)&&(this.year%400==0)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
	}
}