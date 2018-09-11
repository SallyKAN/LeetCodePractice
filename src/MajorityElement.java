import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] A) {
        if(A==null|A.length==0) return 0;
        int n1 = 0, c1 = 0;
        for(int i:A) {
            if(i==n1)   c1++;
            else if(c1==0) {    n1 = i; c1++;   }
            else c1--;
        }
        return n1;
    }
    public static void main(String[] args){
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(new int[]{0,2,2,1,1,1,2,2,4,4,4,4,4,4,4,4}));
    }
}
