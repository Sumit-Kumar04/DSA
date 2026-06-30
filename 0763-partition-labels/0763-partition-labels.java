class Solution {
    public List<Integer> partitionLabels(String s) {
        int position[]=new int[26];        //last position
        for(int i=0;i<s.length();i++){
            position[s.charAt(i)-'a']=i;
        }

        List<Integer> list=new ArrayList<>();

        int max=0;
        int st=0;
        int i=0;
        while(i<s.length()){
            max=Math.max(max,position[s.charAt(i)-'a']);
            if(i==max){
                
                list.add(i-st+1);
                st=i+1;
            }
            i++;
        }
        return list;

       
    }
}