import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
//        int N = nums.length;
        int sum = 0;
//        for (int i=0; i<N; i++){
//            int min = i;
//            for (int j = i+1; j<N;j++){
//                if (nums[j] < nums[min])
//                    min = j;
//            }
//            int tmp = nums[i];
//            nums[i] = nums[min];
//            nums[min] = tmp;
//        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i= i+2){
            sum+= nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        ArrayPartitionI ap = new ArrayPartitionI();
        int[] ex = new int[]{7,3,1,0,0,6};
        System.out.print(ap.arrayPairSum(ex));
    }


}