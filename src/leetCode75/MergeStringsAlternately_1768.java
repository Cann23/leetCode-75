package leetCode75;

public class MergeStringsAlternately_1768 {
    public static void main(String[] args) {
        MergeStringsAlternately_1768 mergeStringsAlternately_1768 = new MergeStringsAlternately_1768();
        System.out.println(mergeStringsAlternately_1768.mergeAlternately("abc","pqr"));
        System.out.println(mergeStringsAlternately_1768.mergeAlternately("ab","pqrs"));
        System.out.println(mergeStringsAlternately_1768.mergeAlternately("abcd","pq"));
        System.out.println(mergeStringsAlternately_1768.mergeAlternately("dfe","beebda"));

    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < word1.length() && index2 < word2.length()) {
           if (index % 2 == 0) {
               sb.append(word1.charAt(index1));
               index1++;
               index++;
           } else {
               sb.append(word2.charAt(index2));
               index2++;
               index++;
           }
        }

        if (index1 < word1.length()) {
            sb.append(word1.substring(index1, word1.length()));
        } else {
            sb.append(word2.substring(index2, word2.length()));
        }

        return sb.toString();
    }
}
