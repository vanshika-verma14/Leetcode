// 1295. Find Numbers with Even Number of Digits
// Given an array nums of integers, return how many of them contain an even number of digits.
class L_1295_even_digit {
    public static void main(String[] args) {
        int[] arr = {-12,345,-2,6,7896, -44, 00, 0};
        System.out.println(check(arr));

}
   static int check(int[] arr){
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
        c += evencheck(arr[i]);
        
    }
    return c;
   }
   static int evencheck(int n){
    if (n == 0 ) {
        return 0;
    }
    int fl = 0;
    while(n!=0){
      n/=10;
      fl++;
    }
    if (fl%2 == 0)
    return 1;
    else
    return 0;
}
}