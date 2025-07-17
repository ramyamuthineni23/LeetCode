class Solution {
    public String minRemoveToMakeValid(String s) {
        /*
            Iterate by each character and append to result if it's a open brace and increment the 
            open brace count and add it to result. As long as open brace count is more than zero, if
            we encounter a closed brace, add it to the result. if it's any other character add it to
            result as well. 
            After this process, the open braces might be more in the result. so repeat this process
            with the reversal of result we've got so far. Note that open braces are treated as closed
            braces and closed braces as open braces when we do it in reverse order. 
            The result returend from this second operation, reverse it and return as result. 
        */



        char[] chars = s.toCharArray();
        StringBuilder result = removeInvalidOpenBraces(chars, '(', ')');
        return removeInvalidOpenBraces(result.reverse().toString().toCharArray(), ')', '(').reverse().toString();
    }

    private StringBuilder removeInvalidOpenBraces(char[] chars, char openbrace, char closedbrace) {
        StringBuilder result = new StringBuilder();
        int openbraces = 0;
        for(char c : chars) {
            if (c == openbrace) {
                result.append(openbrace);
                openbraces++;
            } else if (c == closedbrace) {
                if (openbraces > 0) {
                    result.append(closedbrace);
                    openbraces--;
                }
            } else {
                result.append(c);
            }
        }
        return result;
    }
}