public class L_125_valid_palindrone {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
       s = s.toLowerCase();
       int start = 0;
        int end = s.length()-1 ;
        int i =0;
        String rev = "";
        String temp  = "";
        while(start<=end)
       {
        if(Character.isLetterOrDigit(s.charAt(i)))
       temp += s.charAt(start);
        rev += s.charAt(end);
        start++;
        end--;
        i++;
    
    }
        System.out.println(temp);   
        System.out.println(rev);   

       
       
        // s =  s.toLowerCase();
        // int len = s.length();
        // String rev = "";
        // String temp  = "";
        // for (int i = 0; i < len; i++) {
        //     if(('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') || ('0' <= s.charAt(i) && s.charAt(i) <= '9'))
        //      temp += s.charAt(i);
        // } 
        //  System.out.println(temp);
        //  int tlen = temp.length();
        // for (int i = tlen-1; i >= 0; i--) {
        //      rev += temp.charAt(i);
        // }   
        //  System.out.println(rev);   

     if (temp.equals(rev))
     return true;
     else 
     return false;
    }
}
