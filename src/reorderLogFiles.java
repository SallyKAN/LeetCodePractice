import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author kangjiayuan
 * @Date 2019-03-12
 */

public class reorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            String[] log = logs[i].split(" ");
            if (Character.isDigit(log[1].charAt(0))) {
                digits.add(logs[i]);
            } else {
                letters.add(logs[i]);
            }
        }

        Collections.sort(letters,(l1,l2)->{
            String[] s1 = l1.split(" ");
            String[] s2 = l2.split(" ");
            int len1 = s1.length;
            int len2 = s2.length;
            for (int i=0; i<Math.min(len1,len2);i++){
                if (!s1[1].equals(s2[1])){
                    return s1[i].compareTo(s2[i]);
                }
            }
            return 0;
        });


        for (int i = 0; i < logs.length; i++) {
            if (i < letters.size())
                logs[i] = letters.get(i);
            else logs[i] = digits.get(i-letters.size());
        }
        return logs;
    }

    public static void main(String[] args) {
        String[] test = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        for (String s : reorderLogFiles.reorderLogFiles(test)) {
            System.out.println(s);
        }
    }
}
