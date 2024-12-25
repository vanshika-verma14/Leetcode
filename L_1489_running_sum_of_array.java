import java.util.Arrays;
public class L_1489_running_sum_of_array {
    public static void main(String[] args) {

        int arr[] = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)) );

     }
     static int[] runningSum(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
     }
}
