class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int arr[]=new int[]{-1,-1};
        int min=-1;
        int max=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l + (r - l) / 2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
               arr[0] = mid;
                }
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
          l = 0;
        r = nums.length - 1;  
       

        while(l<=r){
            int mid=l + (r - l) / 2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    arr[1] = mid;
                }
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        
     
        return arr;
        
    }
}
