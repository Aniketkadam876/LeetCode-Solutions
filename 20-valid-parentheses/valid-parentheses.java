class Solution {
    public boolean isOpening(char i){
        if( i == '(' || i == '[' || i == '{'){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(isOpening(s.charAt(i))){
                st.push(s.charAt(i));
            } else{
                if (st.isEmpty()) return false;
                if(s.charAt(i) == ')' && st.pop() != '(' ||
                   s.charAt(i) == ']' && st.pop() != '[' ||
                   s.charAt(i) == '}' && st.pop() != '{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}