class Solution {
    public int totalMoney(int n) {
        int k=n/7;
        int f=28;
        int l= f+(k-1)*7;
        int arithmaticMean=k*(f+l)/2;
        
        int monday=1+k;
        int finalWeek=0;
        if(n%7!=0){
            int extraDays =  n%7;
            for(int i=0;i<extraDays;i++){
                finalWeek+= monday+i;
            }
        }
        return arithmaticMean+finalWeek;   
    }
}