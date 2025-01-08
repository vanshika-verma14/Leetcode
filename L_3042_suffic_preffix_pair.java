public class L_3042_suffic_preffix_pair {
    public static void main(String[] args) {
       String[] arr = {"a","aba","ababa","aa"};
       System.out.println(countPrefixSuffixPairs1(arr));
    }

        public static int countPrefixSuffixPairs1(String[] words) {
       int cnt=0;
                for(int i=0;i<words.length;i++ ){
                String pre=words[i];
                String suf=words[i];
                for(int j=i+1;j<words.length;j++){
                    if(words[j].startsWith(pre) && words[j].endsWith(suf)){
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    public static int countPrefixSuffixPairs2(String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length-1; i++) {
            int ilen = words[i].length();
            for (int j = i+1; j < words.length; j++) {
                int jlen = words[j].length();
                 if(!(ilen > jlen) && words[i].equals(words[j].substring(0,ilen)) && words[i].equals(words[j].substring(jlen-ilen )))
               cnt++;
            }
    }
    return cnt;
}
}