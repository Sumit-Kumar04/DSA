class Solution {
    static int recu(String s1,String s2,int i,int j,int dp[][]){
        if(i<=0|| j<=0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1+recu(s1,s2,i-1,j-1,dp);
        }
        else{

            return dp[i][j]=Math.max(recu(s1,s2,i-1,j,dp),recu(s1,s2,i,j-1,dp));
        }


    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return recu(text1,text2,n,m,dp);
    }
}