public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] re = new int[r][c];
        int R = nums.length;
        int C = nums[0].length;
        int[] tmp = new int[R * C];
        while (r * c == R * C) {
            for (int i = 0, k = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    tmp[k] = nums[i][j];
                    k++;
                }
            }
            for (int i = 0, k = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    re[i][j] = tmp[k];
                    k++;
                }
            }
            return re;
        }
        return nums;
    }

    public static void main(String[] args) {
        ReshapeMatrix rm = new ReshapeMatrix();
        int[][] out = new int[][]{{1, 2}, {3, 4}};
        int[][] ex = rm.matrixReshape(out, 1, 4);
        for (int i = 0; i < ex.length; i++) {
            for (int j = 0; j < ex[i].length; j++) {
                System.out.print(ex[i][j]);
            }
            System.out.println("");
        }
    }
}
