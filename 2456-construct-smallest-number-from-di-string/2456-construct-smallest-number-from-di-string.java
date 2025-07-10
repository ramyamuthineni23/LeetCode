class Solution {
    public String smallestNumber(String pattern) {
    StringBuilder result = new StringBuilder();  // To store final result
    Stack<Integer> numStack = new Stack<>();     // To reverse numbers for 'D'

    // Iterate through the pattern + 1 extra step
    for (int index = 0; index <= pattern.length(); index++) {
        // Always push (index + 1), starting from 1
        numStack.push(index + 1);

        // If we see 'I' or reach the end of pattern,
        // it means we should resolve all previous D's (if any)
        if (index == pattern.length() || pattern.charAt(index) == 'I') {
            // Pop all numbers from the stack and add to result
            while (!numStack.isEmpty()) {
                result.append(numStack.pop());
            }
        }
    }

    return result.toString();
}
}