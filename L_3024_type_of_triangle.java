public class L_3024_type_of_triangle {
    public static void main(String[] args) {
        int[] arr = {5,3,8};
        System.out.println(check(arr));
    }
    public static String check(int[] nums) {

    if(nums[0]+nums[1] <= nums[2] || nums[1] + nums[2]<= nums[0]|| nums[2] + nums[0]<= nums[1])
    return "none";    

    else if(nums[0]==nums[1] && nums[1] ==nums[2])
      return "equilateral";

    else if (nums[0]==nums[1] || nums[1] ==nums[2] || nums[2] ==nums[0])
      return "isosceles";

    else 
      return "scalene";
}
}