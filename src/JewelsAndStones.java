import java.io.IOException;
import java.util.Scanner;

public class JewelsAndStones {
    public static void Check(String a,String b){
        int num = 0;
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        for (char c: bc){
            for (int i =0; i < ac.length;i++){
               if(c == ac[i]) num++;
            }
        }
        System.out.println(num);
    }
    public static void main(String[] agrs) throws IOException {
        System.out.println("jewels:");
        Scanner sj = new Scanner(System.in);
        String j = sj.toString();
        System.out.println("stones:");
        Scanner ss = new Scanner(System.in);
        String s = ss.toString();
        Check(j,s);
    }
}
