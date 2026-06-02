class Solution {
    public int[] dailyTemperatures(int[] tempratures) {
        int [] ans = new int[tempratures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < tempratures.length; i++){
            while(!st.isEmpty() && tempratures[i] > tempratures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}
