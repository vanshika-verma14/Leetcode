public class L_202_happynum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
               int sum = n;
                while(n>=9) {
                 sum = 0;
                 while(n>0)
                {
                 int nn = n % 10;
                 sum += nn*nn;
                 n/=10;
         
                }
                n = sum;
            }
            if(n==1 || n ==7)
            return true;
            else 
            return false;   
        }
 }

