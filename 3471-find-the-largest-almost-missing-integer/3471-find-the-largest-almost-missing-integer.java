class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
       
        
        for(int i=0;i<=n-k;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
            set.add(nums[j]);
            }
            for(int v:set){
                map.put(v,map.getOrDefault(v,0)+1);
            }
        }
        int max=-1;
        for(int key:map.keySet()){
            if(map.get(key)==1){
                max=Math.max(max,key);
            }
        }
        return max;
    }
}