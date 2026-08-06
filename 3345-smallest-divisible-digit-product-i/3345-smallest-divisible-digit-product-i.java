class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag=true;
        int modi=n;
        while(flag){
            int digMulti=1;
            int temp=modi;
            n=modi;
            while(n!=0){
                int rem=n%10;
                digMulti*=rem;
                n/=10;
            }

            if(digMulti%t==0){
              
                return temp;
            }
            temp++;

            modi=temp;


        }
        return -1;
    }
}