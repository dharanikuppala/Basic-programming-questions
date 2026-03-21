import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        int i = 0; // left pointer
        int j = 0; // right pointer
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while(j < s.length()){

            // If character not present → expand window
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;

                maxLength = Math.max(maxLength, set.size());
            }
            else{
                // If duplicate → shrink window
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
