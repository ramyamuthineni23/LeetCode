class Solution {
    public int minimumChairs(String s) {
        int chair = 0, max = 0;
        for(char c:s.toCharArray()){
            if(c == 'E'){
                chair++;
            }
            else{
                max = Math.max(chair,max);
                chair--;
            }
        }
        max = Math.max(chair,max);
        return max;
    }
}