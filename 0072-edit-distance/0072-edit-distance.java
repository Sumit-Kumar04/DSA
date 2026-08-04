class Solution {
     static int n,m;
     static int dp[][]=new int[501][501];
    static int recu(String s1, String s2,int i,int j){
        if(i==0){
            return j;
        }
        if(j==0){
            return i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=recu(s1,s2,i-1,j-1);
        }

        int insert=1+recu(s1,s2,i,j-1);
        int delete=1+recu(s1,s2,i-1,j);
        int replace=1+recu(s1,s2,i-1,j-1);
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));

    }
    public int minDistance(String word1, String word2) {
        n=word1.length();
        m=word2.length();
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
       return recu(word1,word2,n,m);
       
    }
}