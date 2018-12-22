public class reverseWords2 {
    public static String reverseWords(String sentenceIn) {
        String[] words = sentenceIn.trim().split(",");
        int N = words.length;
        StringBuilder builder = new StringBuilder();
        for (int k = 0; k < N; k++) {
                StringBuilder reverseBuilder = new StringBuilder(words[k]);
                builder.append(reverseBuilder.reverse().toString());
                builder.append(",");
        }
            return builder.toString().trim();
    }
    public static void main(String[] args){
        String result = reverseWords("Hello, How are you ");
        System.out.println(result);
    }
}
