class Solution {
    private Integer[] dp;
    public int  solve(int stoneValue[],int i,int n){
        if(i==n) return 0;
        
        if(dp[i] != null) return dp[i];
        
        dp[i]=stoneValue[i] - solve(stoneValue, i+1,n);
        
        if(i+1<n)
            dp[i]=Math.max(dp[i], stoneValue[i] + stoneValue[i+1] - solve(stoneValue, i+2,n));
        
        if(i+2<n)
            dp[i]=Math.max(dp[i],stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - solve(stoneValue, i+3,n));
        
        return dp[i];
    }
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new Integer[n];
        int diff= solve(stoneValue,0,n);
        
        if(diff<0){
            return "Bob";
        }
        else if(diff>0){
            return "Alice";
        }
        
        return "Tie";
        
    }
}