import java.util.Scanner;
import java.lang.Math;
public class most_water{

    public static int maxArea(int[] ht) {
        
        int i = 0, max =0, j = ht.length -1;
        while (i<j){
            int w =  j -i;
            int min = Math.min(ht[i], ht[j]);
            int area = w * min;
            int marea = Math.max(area, max);
            max = marea;
            if(ht[i]>ht[j])
            --j;
            else
            ++i;
        }
        return max;
      
}
//better refined code
public static int maxArea2(int[] height) {  
    int i = 0, max =0, j = height.length -1;
    while (i<j){
        int area = (j -i) * Math.min(height[i], height[j]);
        max = Math.max(area, max);
        if(height[i]>height[j])
        --j;
        else
        ++i;
    }
    return max;
  
}
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxx = maxArea(arr);
        System.out.println("Maximum water: " + maxx);
    
}
}
// -------time complexity is O(n^2)-----------------------
// int max = 0, maxx = 0;
//     for (int i = 0; i < n; i++) {
//         for (int j = i+1 , k = 1; j < n; j++, k++){

//             if(ht[i] *ht[j] > max){
//                 max = ht[i] * k;
//                 int x =Math.min(ht[i], ht[j]);
//                 maxx = x * k;

//             }

//         }
       
// }
// return maxx;
