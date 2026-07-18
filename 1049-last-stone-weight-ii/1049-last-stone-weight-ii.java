class Solution {
    public int lastStoneWeightII(int[] stones) {
         int sum=0;
        for(int x:stones){
            sum+=x;
        }
        int target=sum/2;
        int n=stones.length;
        int dp[][] = new int[n + 1][target + 1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<target+1;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                 int skip=dp[i-1][j];
                 int take=0;

                 if(stones[i-1]<=j){
                take=stones[i-1]+dp[i-1][j-stones[i-1]];
                 }

                 dp[i][j]=Math.max(skip,take);
            }
        }
        return sum-2*dp[n][target];
    }
}