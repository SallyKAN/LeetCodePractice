public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int largest = 0;
        for (int value: nums){
            count = (value == 1)? 1+count : 0;
            if (count > largest)
                largest = count;
        }
        return largest;
    }

    public static void main(String[] args){
        MaxConsecutiveOnes mc = new MaxConsecutiveOnes();
        int[] test = new int[]{0,0,1,1,1,1};
        System.out.println(mc.findMaxConsecutiveOnes(test));
    }
}
