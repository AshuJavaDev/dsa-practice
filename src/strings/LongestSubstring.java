package strings;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s = "abcabcbb";
        int left = 0;
        int maxlength = 0;

        for(int right = 0; right<s.length(); right++)   {
            char c = s.charAt(right);

            while(set.contains(c))  {
                set.remove(s.charAt(left));
                left++;
            }
                set.add(c);
                maxlength = Math.max(maxlength,right-left+1);
        }
        System.out.println("Longest substring length: " +maxlength);
    }

}
