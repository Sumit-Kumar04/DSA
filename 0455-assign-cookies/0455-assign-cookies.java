class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0;
        int gIdx=0;
        int sIdx=0;
        while(gIdx<g.length && sIdx<s.length){
          
                if(g[gIdx]<=s[sIdx]){
                    res++;
                    gIdx++;
                }
                sIdx++;
            
        }
        return res;
    }
}