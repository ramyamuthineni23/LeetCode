class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int sqrtN=(int) Math.sqrt(n);
        for(int i=1;i<sqrtN+1;i++){
          if(n%i==0){
            k--;
            arrayList.add(i);
          }
          if(k==0){
            return i;
          }
        }
        if(sqrtN*sqrtN==n){
          ++k;
        }
        if(k<=arrayList.size()){
          return (n/arrayList.get((arrayList.size()-k)));
        }
        return -1;
    }
}