import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Author kangjiayuan
 * @Date 2019-03-18
 */

public class rotatedDigits {
    public static int rotatedDigits(int N) {
        int count = 0;
        int[] numbers = new int[]{2,5,6,9};
        int[] invalid = new int[]{3,4,7};
        int[] unchanged = new int[]{0,1,8};
        for (int i=1;i<=N;i++){
            int[] digits = new int[4];
            digits[0] = i%10;
            digits[1] = i/10%10;
            digits[2] = i/100%10;
            digits[3] = i/1000%10;
            List<Integer> inter = intersection(digits,numbers);
            List<Integer> inva = intersection(digits,invalid);
            List<Integer> unch = intersection(digits,unchanged);
            if (inter.size()!= 0 && inva.size() == 0 && unch.size()!=3){
                count++;
            }
        }
        return count;
    }
    public static LinkedList<Integer> intersection(int[] A, int[] B){
        LinkedList<Integer> list = new LinkedList<>();
        int pointA = 0;
        int pointB = 0;
        while (pointA < A.length && pointB < B.length){
            if (A[pointA] < B[pointB]) pointA++;
            else if (A[pointA] > B[pointB]) pointB++;
            else {
                list.add(A[pointA]);
                pointA++;
                pointA++;
            }
        }
        return list;
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        System.out.println(rotatedDigits(857));
//        System.out.println(new rotatedDigits().getClass());
//        System.out.println(rotatedDigits.class.getName());
        Class rotate = Class.forName("rotatedDigits");
        Object ob = rotate.newInstance();
        Method method = rotate.getDeclaredMethod("rotatedDigits",int.class);
        System.out.println(method.invoke(ob,10));
        String s = "dada"; }
}
