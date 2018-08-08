public class peakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        int max_index = 0;
            for (int i=0; i<A.length;i++){
                if (A[i] > max){
                    max = A[i];
                    max_index = i;
                }
            }
        return max_index;
    }
    public static void main(String[] args){
        peakIndexInMountainArray pi = new peakIndexInMountainArray();
        int[] A = new int[]{0,1,0};
        System.out.print(pi.peakIndexInMountainArray(A));
    }
}
