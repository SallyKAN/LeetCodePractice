public class reverseWords2 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int N = words.length;
//        String[] wordsTem = new String[N];
//        for(int i = 0; i < N;i++){
//            wordsTem[i] = words[i];
//        }
//        for(int j = 0; j< N; j++){
//            words[j] = wordsTem[N-j-1];
//        }
        StringBuilder builder = new StringBuilder();
        for (int k = 0; k < N; k++) {
                StringBuilder reverseBuilder = new StringBuilder(words[k]);
                builder.append(reverseBuilder.reverse().toString());
                builder.append(' ');
        }
            return builder.toString().trim();
    }
    public static void main(String[] args){
        String result = reverseWords("Let's take LeetCode contest");
        System.out.println(result);
    }
}
