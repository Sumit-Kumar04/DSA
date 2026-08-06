public class Solution {
    public int SmallestNumber(int n, int t) {
        bool flag=true;
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
                flag=false;
                return temp;
            }
            temp++;

            modi=temp;


        }
        return -1;
    }
}