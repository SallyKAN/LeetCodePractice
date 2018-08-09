public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R =matrix.length;
        int C =matrix[0].length;
        for (int i=0; i<R; i++){
            for(int j=0;j<C;j++){
                int first = matrix[i][j];
                for (int k=1;i+k<R &&j+k<C;k++) {
                    if (matrix[i+k][j+k] != first)
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        ToeplitzMatrix tz = new ToeplitzMatrix();
//        int[][] ex = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] ex = new int[][]{{1,2},{2,2}};
        System.out.println(tz.isToeplitzMatrix(ex));
    }
}
