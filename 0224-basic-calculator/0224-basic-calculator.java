class Solution {
    public int calculate(String s) {
        int n=s.length();
        int sum=0;
        
        int sign=1;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int num=0;
                while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                sum+=num*sign;
                i--;

            }
            else if(ch=='+'){
                sign=1;
            }
            else if(ch=='-'){
                sign=-1;
            }
            else if(ch=='('){
                stack.push(sum);
                stack.push(sign);
                sum=0;
                sign=1;
            }
            else if(ch==')'){
                sum=stack.pop()*sum;
                sum+=stack.pop();
            }
        }
        return sum;
    }
}