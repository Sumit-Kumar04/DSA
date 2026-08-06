class Solution {
    boolean dp[][]=new boolean[2001][2001];
    public boolean isMatch(String s, String p) {
        dp[0][0]=true;
        int n=s.length();
        int m=p.length();
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }

        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=(dp[0][j-1]);
            }else{
                dp[0][j]=false;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
               
                if(s.charAt(i-1)==p.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=(dp[i-1][j] || dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}