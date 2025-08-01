class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = cleanString(s); 

        return sb.toString().equals(sb.reverse().toString());
    }

    private StringBuilder cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb;
    }
}