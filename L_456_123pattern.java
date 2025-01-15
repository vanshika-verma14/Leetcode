public class L_456_123pattern {
    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));
        
    }
        public static boolean find132pattern(int[] nums) {
            boolean ans = false;
           for(int i = 0 ; i < nums.length-2; i++)
           {
            if(i < i+1 && i+1 < i+2 && nums[i] < nums[i+2] &&  nums[i+2] < nums[i+1])
            ans = true;
            System.out.println(nums[nums.length-2]);
           } 
            return ans;
        }
}
i < j < k and nums[i] < nums[k] < nums[j].