import java.lang.reflect.Array;
import java.util.*;

public class numSpecialEquivGroups {
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
        for (String S : A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i) {
                char b = S.charAt(i);
                int dif = b - 'a';
                int third = 26 * (i % 2);
                int index = dif + third;
                System.out.print(index+ "  ");
                count[index]++;
            }
            seen.add(Arrays.toString(count));

        }
        return seen.size();
    }

    public static void main(String[] args) {
//        System.out.println("");
        System.out.println("\n"+ numSpecialEquivGroups(new String[]{"abc", "cba", "cd", "ced", "dec"}));
//        int dif = 'a'-'b';
//        System.out.println(dif);
    }

}
