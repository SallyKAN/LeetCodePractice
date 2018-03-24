import java.util.ArrayList;
//import java.util.List;
//
//public class N_Queens {
//    final int N = 4;
//    void printSolution(List<List<String>> board) {
////        int N = 4;
////        int board[][] = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++)
//                System.out.print(" " + board.get(i).get(j)
//                        + " ");
//            System.out.println();
//        }
//        System.out.println();
//
//    }
//
//    boolean isSafe(List<List<String>> board, int row, int col) {
//        int i, j;
//        for (i = 0; i < col; i++)
//            if (board.get(row).get(i) == "Q")
//                return false;
//
//
//        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
//            if (board.get(i).get(j) == "Q")
//                return false;
//
//        for (i = row, j = col; j >= 0 && i < N; i++, j--)
//            if (board.get(i).get(j) == "Q")
//                return false;
//
//
//        return true;
//    }
//
//    boolean solveNQUtil(List<List<String>> board, int col) {
//
////        int j = col;
////        if (col >= N) return true;
////        for (int i=0;i<N;i++)
////        {
////            if(isSafe(board,i,col))
////            {
////                board[i][col] = 1;
////                if (solveNQUtil(board, col + 1) == true)
////                    return true;
////
////                board[i][col] = 0;
////            }
////        }
////        return false;
//        if (col >= N) {
//            printSolution(board);
//            return true;
//        }
//        /* Consider this column and try placing
////           this queen in all rows one by one */
////        for (int i = 0; i < N; i++)
////        {
////            /* Check if queen can be placed on
////               board[i][col] */
////            if (isSafe(board, i, col))
////            {
////                /* Place this queen in board[i][col] */
////                board.get(i).set();
////
////                /* recur to place rest of the queens */
////                solveNQUtil(board, col + 1);
////
////                /* If placing queen in board[i][col]
////                   doesn't lead to a solution then
////                   remove queen from board[i][col] */
////                board.get(i).set(col,"."); // BACKTRACK
////            }
////        }
////        return false;
////    }
////
////    boolean solveNQ() {
////        List<List<String>> board = new ArrayList<List<String>>();
////        ArrayList<String> row  = new ArrayList<String>();
////        row.add(".");
////        row.add(".");
////        row.add(".");
////        row.add(".");
////        board.add(row);
////        board.add(row);
////        board.add(row);
////        board.add(row);
//////        for (int j = 0; j < n; j++) {
//////            row.add(".");
//////        }
//////        for (int i = 0; i < n; i++) {
//////            board.add(row);
//////        }
//////        int board[][]={{0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0},
//////                {0, 0, 0, 0,0,0,0,0}
//////        };
////        if (solveNQUtil(board, 0) == false)
////        {
////            System.out.print("Solution does not exist");
////            return false;
////        }
////        printSolution(board);
////        return true;
////    }
////
////
////    public static void main(String[] args) {
////        N_Queens nqueens = new N_Queens();
////        nqueens.solveNQ();
////    }
//
//}