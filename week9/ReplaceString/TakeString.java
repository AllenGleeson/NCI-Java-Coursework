import java.util.ArrayList;
import java.util.List;

public class TakeString {
    private String userString;
    private StringBuilder replaceVowel = new StringBuilder();
    private StringBuilder secondLetters = new StringBuilder();
    private int letterCount = 0;
    private int vowelCount = 0;
    private List<Integer> spacePositions = new ArrayList<Integer>();
    private String vowels[] = {"A", "E", "I", "O", "U", "Y", "W"};



    public void setUserString(String userString) {
        this.userString = userString;
    }

    public String getReplacedVowels() {
        return replaceVowel.toString();
    }

    public String getSecondLetters() {
        return secondLetters.toString();
    }

    public int getLetterCount() {
        return letterCount;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public int[] getSpacePositions() {
        int[] integers = new int[spacePositions.size()];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = spacePositions.get(i);
        }
        return integers;
    }

    

    public boolean countVowels(String character) {
        boolean vowelFound = false;
        for (String string : vowels) {
            if(string.equals(character.toUpperCase())){
                vowelCount = vowelCount+1;
                vowelFound = true;
            }
        }
        return vowelFound;
    }

    public void countLetters(String name) {
        if(name.matches("[a-zA-Z]+")){
            letterCount = letterCount+1;
        }
    }

    public void replaceString() {
        int index = 0;
        for (String character : this.userString.split("")) {
            switch(character){
                case " ":
                    spacePositions.add(index);
                    replaceVowel.append(character); 
                case ".":
                    replaceVowel.append(character);
                default:
                    countLetters(character);
                    if((letterCount)%2==0){
                        secondLetters.append(character);
                    }
                    if(countVowels(character)){
                        replaceVowel.append("!");
                    }
                    else{
                        replaceVowel.append(character);
                    }
            }
            index = index+1;
        }
    }
}
