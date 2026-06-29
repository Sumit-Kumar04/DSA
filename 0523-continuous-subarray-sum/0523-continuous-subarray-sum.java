class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
       
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        

        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
           

        }

        int l=0;
        int r=0;
        int res=0;
        while(r<nums.length){
            int rem=prefix[r]%k;
            
          
                if(map.containsKey(rem) && (r-map.get(rem))>=2){
                    return true;
                    
                }else if(!map.containsKey(rem)){
                     map.put(rem,r);

                    
                }
                r++;

            }
            
        
        return false;
        
    }
}