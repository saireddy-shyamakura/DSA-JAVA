class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            }
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((top == '(' && current == ')') ||
                    (top == '{' && current == '}') ||
                    (top == '[' && current == ']')) {

                    st.pop();
                } else {

                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    
    }
} 
