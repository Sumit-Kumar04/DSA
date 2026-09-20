class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=26-(ch-'a');
            if(idx>26){
                idx=idx-26;
            }
            sum+=idx*(i+1);
        }
        return sum;
    }
}