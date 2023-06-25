import java.util.Arrays;

public class SortArrayApp{
    public static void main(String[] args) {
        SortArray sortArr = new SortArray();
        int []userArray = {4,10,2,3,19,2,93};
        System.out.println("Even numbers: "+Arrays.toString(sortArr.sortArr(userArray, 0)));
        System.out.println("Odd numbers: "+Arrays.toString(sortArr.sortArr(userArray, 1)));
    }
}