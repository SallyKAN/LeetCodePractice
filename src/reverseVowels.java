public class reverseVowels {
    public static String reverseVowels(String s) {
        String[] words = s.split("");
        String vowel = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (vowel.contains(words[i]) && vowel.contains(words[words.length - i-2])) {
                String tmp = words[i];
                words[i] = words[words.length- i-2];
                words[words.length - i-2] = tmp;
            }
        }
        for (String x:words){
            sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

}
