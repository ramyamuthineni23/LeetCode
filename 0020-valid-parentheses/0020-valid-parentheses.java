class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                Character top = stack.pop();
                if(
                     (currentChar == ')' && top != '(') ||
                     (currentChar == ']' && top != '[') ||
                     (currentChar == '}' && top != '{')
                ) {
                    return false;
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}