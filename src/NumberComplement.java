public class NumberComplement {
    public static int findComplement(int num) {
        StringBuilder binCovert = new StringBuilder();
        StringBuilder binComplement = new StringBuilder();
        while(num > 0){
            int r = num % 2;
            num/=2;
            binCovert.append(r);
        }
        String binNumStr = binCovert.reverse().toString().replaceFirst("^0+(?!$)", "");
        for(int n = 0; n< binNumStr.length(); n++){
            char c = binNumStr.charAt(n) == '1'? '0':'1';
            binComplement.append(c);
        }
        int tenNum = Integer.parseInt(binComplement.toString(),2);
        return tenNum;

    }
    public static void main(String[] args){
        System.out.println(findComplement(5));
    }
}
