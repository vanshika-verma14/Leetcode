class Solution {
    public int[] intersection(int[] arr, int[] brr) {
            Arrays.sort(arr);
        Arrays.sort(brr); 
        int i = 0;
        int j = 0;
        int k = 0;
        int[] un =new int [Math.min(arr.length, brr.length)];
        
        while(i< arr.length && j< brr.length){
             if (arr[i]>brr[j]){
              j++;
            }
            else if (arr[i]<brr[j]){
              i++;
            }
            else {
                if(k==0 || un[k-1]!=arr[i]){
                un[k++] =arr[i];}
                i++;
                j++;
            }
            
        }
        return Arrays.copyOf(un, k);  
    }
}