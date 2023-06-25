public class Diamond {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("    *********".substring(i, 5 + 2 * i));
        }
        for (int i = 5; i > 0; i--){
            System.out.println("     **********".substring(i - 1, 5 + (2 * i) - 3));
        }
    }
}
