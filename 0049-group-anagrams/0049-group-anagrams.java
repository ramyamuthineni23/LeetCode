class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String s : strs) {
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++) {
                count[s.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if(!hashMap.containsKey(key))
                hashMap.put(key,new ArrayList());

            hashMap.get(key).add(s);            
        }
        return new ArrayList(hashMap.values());
        

    }
}