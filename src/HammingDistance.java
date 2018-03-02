public class HammingDistance {
    public static int hammingDistance(int x, int y){
        int c;
        int count = 0;
        c = x^y;
        //count = Integer.bitCount(c);
        for(count =0; c>0; count++){
            c &= c - 1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(hammingDistance(1,4));
    }
}
