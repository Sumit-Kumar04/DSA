class Solution {
    
    static int recu(int coins[],int amount,int  n ,int [][]dp){
        if(amount==0){
            return 0;
        }
        if(n==0){
           
            return Integer.MAX_VALUE;
        }
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }
        int take=Integer.MAX_VALUE;
        if(coins[n-1]<=amount){
           int ans=recu(coins,amount -coins[n-1],n,dp);
           if(ans!=Integer.MAX_VALUE){
            take=1+ans;
           }
        }
       int skip=recu(coins,amount,n-1,dp);
        return dp[n][amount]=Math.min(take,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
       recu(coins,amount,coins.length,dp);
       int res=dp[n][amount];

        return res==Integer.MAX_VALUE?-1:res;
        
    }
}