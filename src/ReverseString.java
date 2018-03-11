public class ReverseString {
    public static String reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        StringBuilder reverseBuilder = builder.reverse();
        return reverseBuilder.toString();
    }
    public static void main(String[] args){
        System.out.println(reverseString("hello"));
    }
}
