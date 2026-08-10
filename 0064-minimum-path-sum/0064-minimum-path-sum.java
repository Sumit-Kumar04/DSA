class Solution {
    private int dp[][];
    private int n;
    private int m;
    
    private int solve(int [][]grid,int i,int j){
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(i >= n || j >= m) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down=solve(grid,i + 1,j);
        int right=solve(grid,i,j + 1);
        
        return dp[i][j]=grid[i][j] + Math.min(down, right);
    }
    public int minPathSum(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        dp = new int[n][m];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return solve(grid,0,0);
    }
}