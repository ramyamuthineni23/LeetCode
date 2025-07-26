class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> parts, List<String> result) {
        // If we already have 4 parts and we're at the end of the string
        if (parts.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }

        // Try every possible split: 1 to 3 digits
        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;

            String part = s.substring(start, start + len);

            // Validate part: no leading zero unless single digit, and <= 255
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) {
                continue;
            }

            parts.add(part); // Choose
            backtrack(s, start + len, parts, result); // Explore
            parts.remove(parts.size() - 1); // Un-choose
        }
    }
}