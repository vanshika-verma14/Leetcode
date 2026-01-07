class Solution {
    public int longestOnes(int[] arr, int k) {
       int r = 0;
      int l = 0;
      int zero = 0;
      int max = Integer.MIN_VALUE;
      while(r<arr.length) {
        if(arr[r]==0)
           zero++; 
        if(zero>k){
            while(zero>k){
            if(arr[l]==0)
                zero--;
            l++;
        }
    }
      max = Math.max(max, r-l+1);
      r++;
    }
    return max;
    }
}