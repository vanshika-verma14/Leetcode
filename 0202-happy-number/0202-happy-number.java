class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast =n;
        do{
             slow = sqr(slow);
             fast = sqr(sqr(fast));
        }while(slow!=fast);

        if(slow == 1){
                return true;
            }
            
        return false;
    }
    public static int sqr(int n){
        int sum =0;
        while(n>0){
         int rem = n%10;
         sum+=rem*rem;
         n= n/10;
        }
        return sum;
    }
}