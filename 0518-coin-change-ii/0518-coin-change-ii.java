class Solution {
    
    
     static int recu(int coins[],int amount,int  n ,int [][]dp){
        if(amount==0){
            return 1;
        }
        if(n==0){
           
            return 0;
        }
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }
        int take=0;
        if(coins[n-1]<=amount){
           take=recu(coins,amount -coins[n-1],n,dp);
          
        }
       int skip=recu(coins,amount,n-1,dp);
        return dp[n][amount]=take+skip;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
       return recu(coins,amount,coins.length,dp);
       
    }
}