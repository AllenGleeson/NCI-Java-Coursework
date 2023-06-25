package PrintGrid;

public class PrintGrid {
    public static void main(String[] args){

        for(int i =0;i<10;i++){
            for(int x =0;x<10;x++){
                if(x==9){
                    System.out.print(" - \n");
                }
                else{
                    System.out.print(" - ");
                }
            }
        }
    }
}
