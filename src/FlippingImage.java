public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
//        int[][] C;
        for (int[] B:A) {
            for (int i = 0; i < B.length / 2; i++) {
                int tmp = B[i];
                B[i] = B[B.length - i - 1];
                B[B.length - i - 1] = tmp;
            }
                for (int j = 0; j < B.length; j++){
                    B[j] ^=1;
                }

            }
        return A;
        }

    public static void main(String[] args){
        FlippingImage f = new FlippingImage();
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
        for (int[] b:f.flipAndInvertImage(a))
            System.out.println(b.toString());
    }

}
