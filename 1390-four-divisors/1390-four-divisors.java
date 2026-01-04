class Solution {
    public int sumFourDivisors(int[] arr) {
        int msum =0;
        for(int i = 0 ; i < arr.length; i++ ){
               int sum = 0;
               int n = 0;
            for(int j = 1; j<= arr[i]; j++){
                     if(n<5){
                     if(arr[i]%j==0 ){
                        sum = sum + j;
                        n++;
                     }
                     }
                     else break;
            }
            if(n==4)
            msum+=sum;
        }
        return msum;
    }
}