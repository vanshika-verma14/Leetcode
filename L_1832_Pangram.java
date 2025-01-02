import java.util.Arrays;
public class L_1832_Pangram {

    public static void main(String[] args) {
        String st = "anmt";
        System.out.println(checkIfPangram(st));
    }
        static boolean checkIfPangram(String sentence) {
            if (sentence.length() < 26) {
                return false;
            }
    
            char[] str = sentence.toCharArray();
            
        for (int i = 'a'; i <='z'; i++) {
            boolean fg = false;
            for (int j = 0; j < str.length; j++) {
                if(i == str[j])
                fg = true;
                break;
            }
            if (fg == false)
            return false;
        } 
        return true;   
    }
}

// char[] str = sentence.toCharArray();
        //     char j = 'a';
        //     int i = 0;
        //     int start = 0;
        //     int end = str.length -1;
        //     while (i != 26) {
        //    while(start <= end) {
        //          int  mid  = start + (end-start) / 2;
        //          if (j < str[mid])
        //          end = mid -1;
        //          else if ((char)i > str[mid])
        //          start = mid +1;
                
        //          else if(i == str[mid] )
        //          ;
        //          else 
        //          return false ;
        //     }
        //     j++;
        // } 
        // return true;  