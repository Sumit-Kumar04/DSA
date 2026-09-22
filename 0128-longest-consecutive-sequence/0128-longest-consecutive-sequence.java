class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for(int e:nums){
            set.add(e);
        }
        for(int e:set){
            if(!set.contains(e-1)){
                int c=1;
                int x=e;
                while(set.contains(x+1)){
                    c++;
                    x=x+1;
                }
                res=Math.max(res,c);
            }
        }
        return res;
        
    }
}