class Solution {
    public static int solve(int m,int n,int x,int y,int dp[][]){
        if(x>=m || y>=n){
            return 0;
        }
        if(x==m-1 && y==n-1){
           return 1;
        }
        if(dp[x][y]!=0){
            return dp[x][y];
        }


        int d=solve(m,n,x+1,y,dp);
        int r=solve(m,n,x,y+1,dp);
        return dp[x][y]=d+r;
    }
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        int res[]=new int[1];
       int dp[][]=new int[m][n];

        return solve(m,n,0,0,dp);
         
        
        
    }
}