class Solution {
    boolean recu(int nums[],int l,int r,int psum1,int psum2,boolean isP1){
       
        if(l>r){
            return psum1>=psum2;
        }


        if(isP1){
            boolean pickLeft=recu(nums,l+1,r,psum1+nums[l],psum2,false);
            boolean pickRight=recu(nums,l,r-1,psum1+nums[r],psum2,false);
            return pickLeft || pickRight;
        }else{
             boolean pickLeft=recu(nums,l+1,r,psum1,psum2+nums[l],true);
            boolean pickRight=recu(nums,l,r-1,psum1,psum2+nums[r],true);
            return pickLeft && pickRight;

        }
         
       
    }
    public boolean predictTheWinner(int[] nums) {
        
        return recu(nums,0,nums.length-1,0,0,true);
    }
}