import java.util.Scanner;
import java.util.Arrays;
class Twosum
{

    public static int[] twoSum(int[] arr, int tg , int n) {
        for (int i = 0; i < n ; i++) {
         for (int j = i+1 ; j < n ; j++) {
            if(arr[i]+arr[j] == tg )
            return new int[]{i,j};
         }
        } 
        
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements in array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }
        System.out.println("Enter the target number - ");
        int tg = sc.nextInt();
        int[] tgarr= twoSum(arr, tg ,n );
        System.out.println("New array of indices " + Arrays.toString(tgarr) );

    }
}