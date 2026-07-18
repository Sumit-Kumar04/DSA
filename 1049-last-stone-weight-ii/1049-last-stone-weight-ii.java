class Solution {
   
    static int recu(int stones[],int target,int n,int currSum,int [][]dp){
        
         if(currSum>target){
            return dp[n][currSum]=Integer.MIN_VALUE;
        }
        if(n<=0){
            return dp[n][currSum]=currSum;
        }
        if(dp[n][currSum]!=-1){
                return dp[n][currSum];
        }


       
        

        int take=recu(stones,target,n-1,currSum+stones[n-1],dp);
        int skip=recu(stones,target,n-1,currSum,dp);

        return dp[n][currSum]=Math.max(take,skip);
    }
    public int lastStoneWeightII(int[] stones) {
        
        int sum=0;
        for(int x:stones){
            sum+=x;
        }
        int target=sum/2;
        int n=stones.length;
        int dp[][] = new int[n + 1][sum + 1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        int best=recu(stones,target,stones.length,0,dp);
        return sum-best*2;
    }
}