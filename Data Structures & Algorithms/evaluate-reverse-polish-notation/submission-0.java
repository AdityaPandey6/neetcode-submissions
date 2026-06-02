class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> st = new Stack<>();
    int i = 0;
    while(i < tokens.length){
        if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
            st.push(Integer.parseInt(tokens[i]));
        }
        else{
            int elem2 = st.pop();
            int elem1 = st.pop();
            if(tokens[i].equals("+")){
                st.push(elem1 + elem2);
            }
            else if(tokens[i].equals("-")){
                st.push(elem1 - elem2);
            }
            else if(tokens[i].equals("*")){
                st.push(elem1 * elem2);
            }
            else{
                st.push(elem1 / elem2);
            }
        }
        i++;
    }
    return st.peek();
    }
}
