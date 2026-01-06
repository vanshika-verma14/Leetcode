class Solution {
    public int maxScore(int[] arr, int k) { 
        int l =0;
        int rs = 0;
        int ls = 0;
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ls = sum;
        max = sum;
        int rindex = arr.length-1;
        for (int i = k-1; i >=0; i--) {
            ls = ls - arr[i];
            rs = rs + arr[rindex];
            rindex--;
            max = Math.max(max, rs+ls);
        }
         return max;
        }  
}