class Trie {
    TrieNode root;
    class TrieNode{
        TrieNode[] children;
        int R=26;
        boolean isEnd=false;
        public TrieNode(){
            children=new TrieNode[26];
        }
        public void put(char ch, TrieNode word){
            children[ch-'a']=word;
        }
        public boolean containsKey(char ch){
            return children[ch-'a']!=null;
        }
        public TrieNode get(char ch){
            return children[ch-'a'];
        }
        public void setEnd(){
            isEnd=true;
        }
        public boolean isEnd(){
            return isEnd;
        }
    
    }
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch,new TrieNode());
            }
            node=node.get(ch);
        }
        node.setEnd();
    }
    
    public TrieNode searchPrefix(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.containsKey(ch)){
               node=node.get(ch);
            }
            else{
                return null;
            }
        }
        return node;
    }
    public boolean search(String word) {
        TrieNode node=searchPrefix(word);
        return node!=null&&node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node=searchPrefix(prefix);
        return node!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */