class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]=new int[nums.length];
        int prefixArray[]=new int[nums.length];
        prefixArray[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixArray[i]=prefixArray[i-1]*nums[i];
        }
        int suffixArray[]=new int[nums.length];
        suffixArray[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffixArray[i]=suffixArray[i+1]*nums[i];

        }
        for(int i=1;i<nums.length-1;i++){
            answer[i]=prefixArray[i-1]*suffixArray[i+1];
        }
        answer[0]=suffixArray[1];
        answer[nums.length-1]=prefixArray[nums.length-2];
        return answer;
    }
    
}