class Solution {
    public int maxProduct(int n) {
        int a=0;
        int b=0;
        while(n!=0){
            int rem=n%10;
            if(rem>=b){
                a=b;
                b=rem;
                
            }else if(rem>=a){
                a=rem;
            }
            n/=10;
        }
        return a*b;
    }
}