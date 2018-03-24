import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
         List<String> strings = new ArrayList<String>();
         String firstRow = "QWERTYUIOPqwertyuiop";
         String secondRow = "ASDFGHJKLasdfghjkl";
         String thirdRow = "ZXCVBNMzxcvbnm";
         List<Character> firstRowChar = new ArrayList<Character>();
        for(int i = 0; i<firstRow.length();i++) {
            firstRowChar.add(firstRow.charAt(i));
        }
        List<Character> secondRowChar = new ArrayList<Character>();
        for(int i = 0; i<secondRow.length();i++) {
            secondRowChar.add(secondRow.charAt(i));
        }
        List<Character> thirdRowChar = new ArrayList<Character>();
        for(int i = 0; i<thirdRow.length();i++) {
            thirdRowChar.add(thirdRow.charAt(i));
        }
         for(String word:words){
             List<Character> chars = new ArrayList<Character>();
             for(int i = 0; i<word.length();i++) {
                 chars.add(word.charAt(i));
             }
             if(firstRowChar.containsAll(chars))
                 strings.add(word);
             else if (secondRowChar.containsAll(chars))
                 strings.add(word);
             else if (thirdRowChar.containsAll(chars))
                 strings.add(word);
             }
             String[] returnWords = new String[strings.size()];
             returnWords = strings.toArray(returnWords);
             return returnWords;
    }
         public static void main(String[] agrs){
        KeyboardRow example = new KeyboardRow();
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = example.findWords(input);
//        for(String out:output){
//           System.out.print(out);
//        }
             System.out.print(Arrays.toString(output));
    }
}
