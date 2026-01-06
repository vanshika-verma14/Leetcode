class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l =0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>=l)
                l= map.get(ch)+1;
            }
            map.put(ch, r);
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}