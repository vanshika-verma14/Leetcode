class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] srr = s.toCharArray();
        Arrays.sort(srr);
        char[] trr = t.toCharArray();
        Arrays.sort(trr);
        for(int i = 0; i< srr.length; i++){
            if(srr[i]!=trr[i]){
            return false;
            }
        }
        return true;
    }
}