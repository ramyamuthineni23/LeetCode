class Solution {
    public int nthUglyNumber(int n) {
        //The logic is any ugly number can be represented as pow(2,a)*pow(3,b)*pow(5,c)
        //So if x is an ugly number, whatever numbers we will be getting by multiplying 2,3 or 5 in it
        //Will also be an ugly number
        //So we are keeping 3 variables, and taking the minimum from them, and moving ahead
        
        int[] arr = new int[n+1];
        int i2, i3, i5;
        i2 = i3 = i5 = 1;
        arr[1] = 1;

        for(int i=2;i<=n;i++){
            int i2Ugly = arr[i2] * 2;
            int i3Ugly = arr[i3] * 3;
            int i5Ugly = arr[i5] * 5;
            
            int minUgly = Math.min(i2Ugly, Math.min(i3Ugly, i5Ugly));
            arr[i] = minUgly;

            if(i2Ugly == minUgly)
                i2++;
            if(i3Ugly == minUgly)
                i3++;
            if(i5Ugly == minUgly)
                i5++;
        }

        return arr[n];
    }
}