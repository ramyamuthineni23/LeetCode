public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> uniqueCharacters = new HashSet<>();
        int result = 0;
        int startIndex = 0, endIndex = 0; 
        while (startIndex <= endIndex && endIndex < s.length()) {
            while (uniqueCharacters.contains(s.charAt(endIndex))) {
                uniqueCharacters.remove(s.charAt(startIndex));
                startIndex++;
            }

            result = Math.max(result, endIndex - startIndex + 1);
            uniqueCharacters.add(s.charAt(endIndex));
            endIndex++;
        }
        return result;
    }
}