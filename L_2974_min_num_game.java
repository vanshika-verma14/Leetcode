import java.util.Arrays;
public class L_2974_min_num_game {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(arr)));
    }
    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        int fst = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < fst) {
                sec = fst;
                fst = i;
            }
            else if (i< sec && i != fst) {
                sec = i;
            }
             
        }
    }
}
