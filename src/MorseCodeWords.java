import java.util.*;

public class MorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> wordList = Arrays.asList(letters);
        HashSet<String> morselist = new HashSet<String>();
        for(String word:words){
            String[] wordlestters = word.split("(?!^)");
            StringBuilder morseword = new StringBuilder();
            for (String letter: wordlestters){
                int index = wordList.indexOf(letter);
                morseword.append(morsecode[index]);
            }
//            String newMoreseword = morseword.toString().replace(",","");
//            System.out.println(newMoreseword.replaceAll(" ",""));
            morselist.add(morseword.toString());
        }

        return morselist.size();
    }
    public static void main(String[] arg){
        MorseCodeWords morseCodeWords = new MorseCodeWords();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(morseCodeWords.uniqueMorseRepresentations(words));
    }

}
