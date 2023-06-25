public class BottlesGame{
	public static void main(String[] args){
		for (int i = 99; i > 0; i--) {
            if(i==1){
                System.out.println(i+" bottle of beer on the wall, "+i+" bottle of beer.");
                System.out.println(" You take one down, you pass it around, no more bottles of beer on the wall.");
            }
            else{
                System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer.");
                if(i==2){
                    System.out.println(" You take one down, you pass it around, "+(i-1)+" bottle of beer on the wall.");
                }
                else{
                    System.out.println(" You take one down, you pass it around, "+(i-1)+" bottles of beer on the wall.");
                }
            }
		}
	}
}
