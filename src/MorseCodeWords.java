import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> wordList = Arrays.asList(letters);
        ArrayList<String> morselist = new ArrayList<String>();
        for(String word:words){
            String[] wordlestters = word.split("(?!^)");
            ArrayList<String> morseword = new ArrayList<String>();
            for (String letter: wordlestters){
                int index = wordList.indexOf(letter);
                morseword.add(morsecode[index]);
            }
            String newMoreseword = morseword.toString().replace(",","");
//            System.out.println(newMoreseword.replaceAll(" ",""));
            morselist.add(newMoreseword.replaceAll(" ",""));
        }
        long total = morselist.stream().distinct().count();
        return (int)total;
    }
    public static void main(String[] arg){
        MorseCodeWords morseCodeWords = new MorseCodeWords();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(morseCodeWords.uniqueMorseRepresentations(words));
    }

}
