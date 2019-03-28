/**
 * @Description
 * @Author kangjiayuan
 * @Date 2019-03-28
 */

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char[] letters = word.toCharArray();
        for (int i = 1; i <= letters.length; i++) {
            if (letters[0] < 97) {
                if (letters[1] < 97) {
                    while (letters[i] >= 97) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (letters[i] < 97) {
                    return false;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
}
