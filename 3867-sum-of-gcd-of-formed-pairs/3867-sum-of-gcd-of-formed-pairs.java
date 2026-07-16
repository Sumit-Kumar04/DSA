class Solution {
    public static int gcd(int a ,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
       
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(nums[i],max);
         
        }
        Arrays.sort(prefix);
        long result = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            result += gcd(prefix[i], prefix[j]);
            i++;
            j--;
        }
        return result;
    }
}