class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int res=0;
        int c=0;
        String v="aeiou";
        while(r<s.length()){
            char ch=s.charAt(r);
            if(v.contains(ch+"")){
                    c++;
                }
            if((r-l+1)==k){
                res=Math.max(res,c);
                char ch2=s.charAt(l);
                if(v.contains(ch2+"")){
                    c--;
                }
                l++;

                
            }
            r++;
        }
        return res;
    }
}