public class judgeCircle {
    public static boolean ifCircle(String moves) {
        int r = 0;
        int d = 0;
        int u = 0;

        int l = 0;
        char[] move = moves.toCharArray();
        for(int i=0; i<move.length;i++){
            if ( move[i] == 'U') u++;
            if ( move[i] == 'D') d++;
            if ( move[i] == 'R') r++;
            if ( move[i] == 'L') l++;
        }
        if( u == d && r == l) return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(ifCircle("UD"));
    }
}
