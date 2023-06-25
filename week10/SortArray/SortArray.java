import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public int[] sortArr(int[] userNumbers, int choice) {
        List<Integer> userNumberList = new ArrayList<Integer>();
        int[] sortedArray;
        
        for (int number : userNumbers) {
            if(choice==0){
                if(number%2==0){
                    userNumberList.add(number);
                }
            }
            else {
                if(number%2>0){
                    userNumberList.add(number);
                }
            }
        }
        sortedArray = new int[userNumberList.size()];
        Collections.sort(userNumberList);
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = userNumberList.get(i);
        }
        
        return sortedArray;
    }
}
