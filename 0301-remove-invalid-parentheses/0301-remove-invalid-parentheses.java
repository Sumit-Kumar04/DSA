class Solution {
    HashSet<String> set;
    public void solve(String s,int counter,int idx,String curr,int maxLen[]){
        if(counter<0){
            return;
        }
        if(idx==s.length()){
            if(counter==0){
                if(curr.length()>maxLen[0]){
                    maxLen[0]=curr.length(); 
                    
                    set.clear();
                    set.add(curr);
                }else if(curr.length()==maxLen[0]){
                    set.add(curr);
                }
               
                
            }
            return;
        }
        char ch=s.charAt(idx);
        if(ch!='('  && ch!=')'){
            
            solve(s,counter,idx+1,curr+ch,maxLen);
            return;
        }
         if(ch=='('){
        solve(s,counter+1,idx+1,curr+ch,maxLen);

        solve(s,counter,idx+1,curr,maxLen);
        
        return;
        }
        if(ch==')'){
        solve(s,counter-1,idx+1,curr+ch,maxLen);
        solve(s,counter,idx+1,curr,maxLen);
        }

    }
    public List<String> removeInvalidParentheses(String s) {
        set=new HashSet<>();
        solve(s,0,0,"",new int[]{Integer.MIN_VALUE});
        List<String> list=new ArrayList<>();
        for(String str:set){
            list.add(str);
        }
        return list;

    }
}