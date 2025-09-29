class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            // Greedily add words until we exceed maxWidth
            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder sb = new StringBuilder();
            int gapCount = last - index - 1;

            // Case 1: Last line OR only one word → left justified
            if (last == words.length || gapCount == 0) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]).append(" ");
                }
                sb.deleteCharAt(sb.length() - 1); // remove extra space at end
                while (sb.length() < maxWidth) {
                    sb.append(" "); // pad remaining spaces
                }
            } 
            // Case 2: Fully justify (distribute spaces)
            else {
                int spaces = (maxWidth - totalChars) / gapCount;
                int extra = (maxWidth - totalChars) % gapCount;

                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]).append(" ");
                    // Add evenly distributed spaces
                    for (int j = 0; j < spaces + (i - index < extra ? 1 : 0); j++) {
                        sb.append(" ");
                    }
                }
                sb.append(words[last - 1]); // last word (no extra spaces after)
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}