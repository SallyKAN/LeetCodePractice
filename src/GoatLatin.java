public class GoatLatin {
    public static String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < words.length; i++) {
            if (vowel.contains(String.valueOf(words[i].charAt(0))))
                sb.append(words[i] + "ma");
            else if (words[i].length() > 1)
                sb.append(words[i].substring(1, words[i].length()).concat(words[i].substring(0, 1))
                        + "ma");
                // else if(words[i].length()==2)
                //     sb.
            else
                sb.append(words[i].substring(0) + "ma");
            for (int j = 0; j <= i; j++)
                sb.append("a");
            sb.append(" ");
        }
        return sb.toString().trim();


    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
//        String i = "abc";
//        System.out.println(i.substring(0, 1).concat("1"));
    }
}
