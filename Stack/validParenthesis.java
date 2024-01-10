class Solution {
    public boolean isValid(String s) {
       Stack<Character> st= new Stack<>();
        int n=s.length();

        for(int i=0; i<n; i++){ 
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
            st.push(s.charAt(i));
            }else{
                if(st.empty())
                return false;

                char c = st.peek();
                st.pop();
             
                if(((s.charAt(i) == ')' && c == '(' ) || (s.charAt(i) == ']' && c == '[' ) || (s.charAt(i) == '}' && c == '{' ))==false)
                    return false;    
            }
        }

        return st.empty();
    }
}
