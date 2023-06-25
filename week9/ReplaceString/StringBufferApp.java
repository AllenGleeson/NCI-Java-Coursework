import javax.swing.*;
import java.util.Arrays;

public class StringBufferApp{
    public static void main(String[] args) {
        TakeString x = new TakeString();
        String b = JOptionPane.showInputDialog(null, "Please enter a string or sentence:");
        
        x.setUserString(b);
        x.replaceString();

        JOptionPane.showMessageDialog(null, "There was "+x.getVowelCount()+" vowels. \n"
        +x.getLetterCount()+" letters.");
        JOptionPane.showMessageDialog(null, "The index for each space you entered is: "+Arrays.toString(x.getSpacePositions()));
        JOptionPane.showMessageDialog(null, "You entered: "+b+"\nHere is your string with the vowels replaced with explanation points:\n"+x.getReplacedVowels());
        JOptionPane.showMessageDialog(null, "You entered: "+b+"\nHere every second letter from your string:\n"+x.getSecondLetters());
    }
}