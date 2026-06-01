class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());
        int [] ans = new int[k];
        int s = 0;
        for(int i = 0 ; i < k ; i++){
            Map.Entry<Integer, Integer> entry = list.get(i);
            ans[s++] = entry.getKey();
        }
        return ans;
    }
}
