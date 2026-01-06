class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
        return 1;
        int max = 0;
     HashMap<Character, Integer> map = new HashMap<>();
     for (int i = 0; i < s.length(); i++) {
        map.clear();
        for (int j = i; j < s.length(); j++) {
            char ch = s.charAt(j);
              int count = map.getOrDefault(ch, 0)+1;
              if(count> 1)
              {
                break;
              }
              map.put(ch, map.getOrDefault(ch, 0)+1);
              max = Math.max(max, map.size());

        }
     }
     return max;
    }
}