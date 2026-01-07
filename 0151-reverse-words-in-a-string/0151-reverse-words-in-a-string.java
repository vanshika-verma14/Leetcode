class Solution {
    public String reverseWords(String s) {
        String[] srr = s.trim().split("\\s+");
        int start =0;
        int end = srr.length-1;
        while(start <  end){
           String temp = srr[start];
           srr[start] = srr[end];
           srr[end] = temp;
           start++;
           end--;
        }
        String result = String.join(" ", srr);
        return result;
    }
}