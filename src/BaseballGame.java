public class BaseballGame {
    public int calPoints(String[] ops) {
        int scores = 0;
        for (int i = 0; i < ops.length; i++) {
            if (isInterger(ops[i]))
                scores = scores + Integer.valueOf(ops[i]);
            if (ops[i].equals("C") && i > 0 && isInterger(ops[i - 1]))
                while(!isInterger(ops[i-1]))
                    i--;
                scores = scores - Integer.valueOf(ops[i - 1]);
//            if (ops[i].equals("D")&& i > 0 && isInterger(ops[i - 1]))
        }
        return 1;
    }
    public boolean isInterger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }
    public boolean isValid(String str){

        return false;
    }

}
