public class L_9_palindrone {
        public boolean isPalindrome(int x) { 
            int temp = x;
            int rev = 0;
         while(temp!=0 && x>0){
          int n = temp%10;
           rev = rev * 10 + n;
           temp /=10;
         }   
         if (rev == x)
         return true;
         else 
         return false;
        }
    }

