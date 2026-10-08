class Solution { 
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        Boolean flag=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             
            if(ch=='('){
                if(c>0){
                sb.append(ch);
                }
                c++;
            }
            else{
                c--;
                if(c>0){
                sb.append(ch);
               }
            }
           
            System.out.println(c);
            
           
        }
        return sb.toString();
        
    }
}