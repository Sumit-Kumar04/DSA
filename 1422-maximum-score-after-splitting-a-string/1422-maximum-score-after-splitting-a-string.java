class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int arrl[]=new int[n];
        
        int arrr[]=new int[n];
        int z=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0') z++;
            arrl[i]=z;
        }
        int one=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1') one++;
            arrr[i]=one;
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            res=Math.max(res,arrl[i]+arrr[i+1]);
        }
        return res;
    }
}