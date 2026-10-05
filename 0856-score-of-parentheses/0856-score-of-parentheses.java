class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(0);
            } 
            else {
                int inside=st.pop();
                int val;
                if(inside==0){
                    val=1;
                }else{
                    val=2*inside;
                }

                st.push(st.pop()+val);
            }
        }

        return st.peek();
    }
}