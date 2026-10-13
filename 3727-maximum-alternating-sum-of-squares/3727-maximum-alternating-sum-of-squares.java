class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        long res=0;
        boolean turnB=true;
        while(i<=j){
            if(turnB){
                res=res+(long)(nums[j]*nums[j]);
                turnB=false;
                j--;
            }
            else{
                res=res-(long)(nums[i]*nums[i]);
                turnB=true;
                i++;
            }
           
            
        }
        return res;
    }
}