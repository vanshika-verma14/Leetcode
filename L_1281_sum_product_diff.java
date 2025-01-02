public class L_1281_sum_product_diff {
    public static void main(String[] args) {
        int  n = 234;
        System.out.println(difference(n));
    }
    static int difference(int n){
        int sum = 0;
        int pro = 1;
        while(n!=0)
        {
            int nn = n % 10;
            sum += nn;
            pro *= nn;
            n /= 10;
        }
        return pro-sum;
    }
}
