class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int res=0;
        int i=0;
        int j=0;
        int map[]=new int[3];
        while(j<n){
            char ch=s.charAt(j);
            map[ch-'a']++;

            while(map[0]>0 && map[1]>0 && map[2]>0){
                res+=(n-j);
                map[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return res;

    }
}