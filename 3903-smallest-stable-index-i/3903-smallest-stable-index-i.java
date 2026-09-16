class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int preMax[]=new int[n];
        int postMin[]=new int[n];
        preMax[0]=nums[0];
        postMin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            preMax[i]=Math.max(nums[i],preMax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            postMin[i]=Math.min(nums[i],postMin[i+1]);
        }
        int res=-1;
        for(int i=0;i<n;i++){
            int diff=preMax[i]-postMin[i];
            if(diff<=k){
                res=i;
                break;
            }
        }
        return res; 
    }
}