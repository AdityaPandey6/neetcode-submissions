class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[]arr = s.toCharArray();
        char[]arr2 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i = 0;
        for(char c : arr){
            if(c != arr2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
