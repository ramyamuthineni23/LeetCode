class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') 
            && i - 1 >= 0 && s.charAt(i-1) == 'I') {
                if (s.charAt(i) == 'V') {
                    sum += 4;
                    i--;
                } else if (s.charAt(i) == 'X') {
                    sum += 9;
                    i--;
                }
            } else if ( (s.charAt(i) == 'L' || s.charAt(i) == 'C') 
            && i - 1 >= 0 && s.charAt(i-1) == 'X') {
                if (s.charAt(i) == 'L') {
                    sum += 40;
                    i--;
                } else if(s.charAt(i) == 'C') {
                    sum += 90;
                    i--;
                }
            } else if ( (s.charAt(i) == 'D' || s.charAt(i) == 'M') 
            && i - 1 >= 0 && s.charAt(i-1) == 'C') {
                if (s.charAt(i) == 'D') {
                    sum += 400;
                    i--;
                } else if (s.charAt(i) == 'M') {
                    sum += 900;
                    i--;
                }
            } else {
                sum += map.get(s.charAt(i));
            }
        }
            
        return sum;
    }
}