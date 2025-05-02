public class Main1071 {

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrsdsss";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int i=0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result += word1.charAt(i);
            }
            if( i < word2.length()){
                result += word2.charAt(i);
            }
            i++;
        }
        return result;
    }
}
