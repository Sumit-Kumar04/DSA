class Solution {
    int dp[][][] ;
    int m;
    int n;
    
    public boolean solve(int i,int j,int openCount, char grid[][]){
        openCount += grid[i][j]=='('? 1:-1;
        if(openCount<0){
            return false;
        }
        if(dp[i][j][openCount]!=-1){
            return dp[i][j][openCount]==1;
        }
        if(i==m-1 &&  j==n-1){
            dp[i][j][openCount]=(openCount==0)?1:0;
            return openCount==0;
        }
        if(i+1<m){
            if(solve(i+1,j,openCount,grid)){
                dp[i][j][openCount]=1;
                return true;
            }
        }

        if(j+1<n){
            if(solve(i,j+1,openCount,grid)){
                dp[i][j][openCount]=1;
                return true;
            }
        }

        dp[i][j][openCount]=0;
        return false;

    }  


    
    public boolean hasValidPath(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        dp=new int[m][n][201];
        for(int row[][]:dp){
            for(int col[]:row){
                Arrays.fill(col,-1);
            }
        }
        return solve(0,0,0,grid);

    }
     
}