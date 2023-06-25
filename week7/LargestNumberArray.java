public class LargestNumberArray {  
    public static void main(String[] args) {
        int [] numbers = new int [] {42, 8, 106, 63, 25, 81, 67};
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i] > largest){
                largest = numbers[i];
           }
        }  
        System.out.println("Largest number in the array is: "+largest);  
    }  
}  