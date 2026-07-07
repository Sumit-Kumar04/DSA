class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        long sum=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='0'){
                sb.append(c);
                sum+=(c-'0');
                
            }
        }
        if(sb.length()==0) return 0;
        long num=Long.parseLong(sb.toString());
        return num*sum;
        
    }
}