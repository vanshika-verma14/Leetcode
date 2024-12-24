import java.util.Arrays;
public class L_1929_concatenation_of_array{
 public static void main(String[] args) {
    int arr[] = {1,3,2,1};
    System.out.println(Arrays.toString(getConcatenation3(arr)) );
 }   

 //both 2 and 3 have same time
 static int[] getConcatenation3(int[] nums) {
    int len = nums.length;
    int[] arr = new int[2*len];
    for (int i = 0; i < len; i++) {    
          arr[i] = nums[i];
          arr[i+len] = nums[i];
    }
    System.gc();
    return arr;

 }
 static int[] getConcatenation2(int[] nums) {
     int orlen = nums.length;
    int len = 2 * nums.length;
    int[] arr = new int[len];
    int i =0;
    while(i<len/2)
    {
        arr[i] = nums[i];
        i++;
    }
    while(i!=len)
    {
        arr[i] = nums[i-orlen];
        i++;
    }
    System.gc();
    return arr;
 }

 
  //slower less efficient
 static int[] getConcatenation(int[] nums) {
    int orlen = nums.length;
    int len = 2 * nums.length;
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        if(i < len/2)     
          arr[i] = nums[i];
        else if (i >= len/2)
          arr[i] = nums[i-orlen];
    }
    return arr;

 }
}