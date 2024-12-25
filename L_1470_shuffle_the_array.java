import java.util.Arrays;
public class L_1470_shuffle_the_array {
    public static void main(String[] args) {

        int arr[] = {2,5,1,3,4,7,8};
        int n =3;
        System.out.println(Arrays.toString(shuffle(arr , n)) );

     }
     static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length/2; i++) {
            arr[c] = nums[i];
            arr[c+1] = nums[n+i];
            c+=2;
        }
        return arr;
        }
    
}
