class Solution {
    static Boolean dp[][];
    static boolean recu(int nums[],int n,int t,Boolean dp[][]){
        if(n<=0){
            return false;
        }
        if(t==0){
            return true;
        }
        if(dp[n][t]!=null){
            return dp[n][t];
        }
        boolean take=false;
        if(t>=nums[n-1]){
        take=recu(nums,n-1,t-nums[n-1],dp);
        }
        boolean skip=recu(nums,n-1,t,dp);
        return dp[n][t]=take||skip;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }else{
            int target=sum/2;
            dp=new Boolean[nums.length+1][sum+1];
            for(Boolean arr[]:dp){
                Arrays.fill(arr,null);
            }
        return recu(nums,nums.length,target,dp);
        }
    }
}