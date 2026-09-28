class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                stack.push('(');
                c++;
                max=Math.max(c,max);
            }
            else {
                if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
                c--;
                 
                }
            }
        }
       return max;
        
    }
}