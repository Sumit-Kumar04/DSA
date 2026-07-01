class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        if(t.length()>s.length()){
            return "";
        }
        int []freq=new int[128];
        int dist=0;
        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)]==0) dist++;
            freq[t.charAt(i)]++;

        }
        int i=0;
        int j=0;
        int found=0;
        int windowSize=Integer.MAX_VALUE;
        int st_i=0;
        while(j<n){
            freq[s.charAt(j)]--;
            if(freq[s.charAt(j)]==0) found++;
            
            while(i<=j && dist==found){
                if (j - i + 1 < windowSize) {
                    windowSize = j - i + 1;
                    st_i = i;
                }
                
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)]>0){
                  
                    found--;
                }
                i++;
            }
            j++;

        }
        
       
        return (windowSize==Integer.MAX_VALUE)?"":s.substring(st_i,st_i+windowSize);
        
    }
}