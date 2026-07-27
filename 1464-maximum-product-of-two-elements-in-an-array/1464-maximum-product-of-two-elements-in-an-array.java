class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            if(i>=b){
                a=b;
                b=i;
            }else if(i>=a){
                a=i;
            }
        }
        return (a-1)*(b-1);
    }
}