import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int max = 0;
        Integer[] min = new Integer[2];
        for (int i=0;i<nums.length;i++){
            min[0] = nums[i];
            for (int j =0; j<nums.length;j++){
                if(i == j) continue;
                min[1] = nums[j];
                int minum = Collections.min(Arrays.asList(min));
            }
        }
        return max;
    }
    static void combinationUtil(int[] nums){

    }

}