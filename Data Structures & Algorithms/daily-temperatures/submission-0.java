class Solution {
    public int[] dailyTemperatures(int[] tempratures) {
        int [] ans = new int[tempratures.length];
        Arrays.fill(ans, 0);
        for(int i = 0 ; i < tempratures.length-1 ; i++){
            int curr = tempratures[i];
            int j = i+1;
            int k = 1;
            while(j < tempratures.length){
                if(curr < tempratures[j]){
                    ans[i] = k;
                    break;
                }
                k++;
                j++;
            }
        }
        return ans;
    }
}
