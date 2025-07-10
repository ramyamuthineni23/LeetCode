class Solution {
    public String betterCompression(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i++);
            int count = 0;

            // Read full number (could be more than one digit)
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i++) - '0');
            }

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + count);
        }

        // Build result in alphabetical order
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (freqMap.containsKey(c)) {
                sb.append(c).append(freqMap.get(c));
            }
        }

        return sb.toString();
    }
}
