class Solution {
    public boolean isPalindrome(String s) {
        String ss ="";
        s = s.toLowerCase();
        for(int i = 0; i <  s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=65&&ch<= 90 || ch>=97 &&ch<= 122 ||ch>=48 &&ch<= 57 ){
                ss = ss + ch;
            }
        }
        StringBuilder sb = new StringBuilder(ss);
        sb.reverse();
        if(sb.toString().equals(ss))
        return true;
        else return false;
    }
}