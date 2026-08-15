class Solution {
    public int longestSubsequence(int[] nums) {
       int n=0;
       int xor=0;
        for(int val:nums){
            xor^=val;
        }
        boolean flag=true;
        for(int val:nums){
            if(val!=0){
                flag=false;
                break;
            }
        }
        
        if(flag) return 0;
        return (xor==0)?nums.length-1:nums.length;
    }
}