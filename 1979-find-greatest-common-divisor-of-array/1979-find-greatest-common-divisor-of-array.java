class Solution {
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int g = arr[0];
        int s = arr[arr.length-1];
        while(s>=1){
            int r = g%s;
            g=s;
            s=r;
            
        }
        return g;
    }
}