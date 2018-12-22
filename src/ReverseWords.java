public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int N = words.length;
        String[] wordsTem = new String[N];
        for(int i = 0; i < N;i++){
            wordsTem[i] = words[i];
        }
        for(int j = 0; j< N; j++){
            words[j] = wordsTem[N-j-1];
        }
        StringBuilder builder = new StringBuilder();
        if(s != "") {
            for (int k = 0; k < N; k++) {
                builder.append(words[k]);
                builder.append(' ');
            }
            return builder.toString();
        }
        return s;
    }
    public static void main(String[] args){
        String result = reverseWords("How,are you");
        System.out.println(result);
    }
}
