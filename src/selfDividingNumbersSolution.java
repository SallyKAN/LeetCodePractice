import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbersSolution {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> output = new ArrayList<Integer>((right-left)+1);
        int i;
        for(i = left; i<= right;i++) {
            int firstDigit = 0;
            int secondDigit = 0;
            int thirdDigit =0;
            int fourthDigit =0;
            firstDigit = getNthDigit(i, 10, 1);
            secondDigit = getNthDigit(i, 10, 2);
            thirdDigit = getNthDigit(i, 10, 3);
            fourthDigit = getNthDigit(i, 10, 4);
            if (i / 1000 != 0) {
                if ((secondDigit != 0) && (thirdDigit != 0) && (firstDigit != 0)) {
                    if ((i % firstDigit == 0) && (i % secondDigit == 0)
                            && (i % thirdDigit == 0)
                            && (i % fourthDigit == 0))
                        output.add(i);
                }
            }
            else if(i/ 100 != 0){
                if ((secondDigit != 0)  && (firstDigit != 0)) {
                    if ((i % firstDigit == 0) && (i % secondDigit == 0)
                            && (i % thirdDigit == 0))
                        output.add(i);
                }
            }
            else if(i/ 10 != 0){
                if (firstDigit != 0) {
                    if ((i % firstDigit == 0) && (i % secondDigit == 0))
                        output.add(i);
                }
            }
            else
                output.add(i);
        }
        return output;
    }
    public static void main(String[] args){
        selfDividingNumbersSolution solution = new selfDividingNumbersSolution();
        System.out.println(solution.selfDividingNumbers(47,85));
//        System.out.println(solution.getNthDigit(1234,10,1));
//        System.out.println(solution.getNthDigit(1234,10,2));
//        System.out.println(solution.getNthDigit(1234,10,3));
//        System.out.println(solution.getNthDigit(1234,10,4));

    }
    public int getNthDigit(int number, int base, int n) {
        //return (int) ((number / Math.pow(base, n - 1)) % base);
        return (int) ((number % Math.pow(base,n)/Math.pow(base,n-1)));

    }
}
