class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> ans = new ArrayList<>(); 
        for(int i = 0 ; i < len-1 ; i++){
            if(strs[i] == "#") continue;
            List<String>temp = new ArrayList<>();
            temp.add(strs[i]);
            char[]arr = strs[i].toCharArray();
            Arrays.sort(arr);
            for(int  j = i +1 ; j < len ;j++){
                if(strs[i].length() == strs[j].length()){
                    char[] arr2 = strs[j].toCharArray();
                    Arrays.sort(arr2);
                    boolean flag = true;
                    for(int k = 0 ; k< arr.length ; k++){
                        if(arr[k] != arr2[k]) flag = false; 
                    }
                    if(flag){
                        temp.add(strs[j]);
                        strs[j] = "#";
                    }
                }
            }
            ans.add(temp);
        }
            if (strs[len-1] != "#"){
                List<String> s = new ArrayList<>();
                s.add(strs[len-1]);
                ans.add(s);
            }
        return ans;
    }
}
