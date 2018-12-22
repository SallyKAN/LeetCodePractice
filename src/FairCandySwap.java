import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int asum =0;
        int bsum = 0;
        for (int a:A) {
            asum = +a;
        }
        for (int b:B){
            bsum = +b;
        }
//
        return new int[]{asum,bsum};
    }
    public static void main(String[] args){
        for (int x: fairCandySwap(new int[]{1,2},new int[]{3,4}))
        System.out.println(x);
    }
}
