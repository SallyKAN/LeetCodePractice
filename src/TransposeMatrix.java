public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int N = A.length;
        int[][] flipped = new int[A[0].length][A.length];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < A[i].length; j++) {
                flipped[j][i] = A[i][j];
            }
        }
        return flipped;
    }

    public static void main(String[] args) {
        int[][] ex = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TransposeMatrix ts = new TransposeMatrix();
        int[][] out = ts.transpose(ex);
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println("");
    }
    }
}