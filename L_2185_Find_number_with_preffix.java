public class L_2185_Find_number_with_preffix {
    public static void main(String[] args) {
        String[] arr = {"pay","attention","practice","attend"};
        String pref = "yt";
        System.out.println(prefixCount(arr, pref));
     }
     public static int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].startsWith(pref))
              cnt++;
        }
        return cnt;
     }

}
