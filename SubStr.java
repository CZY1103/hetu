public class SubStr {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        char[] s1=s.toCharArray();
        boolean[] b=new boolean[n];
        int b_l=0;
        for(int i=0;i<n-1;i++){
            for(int j= 0;j<s.length()-1;j++){
                if(p[i] == String.valueOf(s1[j])){
                    b[b_l]=true;
                }
            }
            b[b_l]=false;
            b_l++;
        }
        return b;
    }

    public static void main(String[] args) {
        String[] p={"a","b","c","d"};
        int n = 4;
        String s ="abc";
        System.out.println(chkSubStr(p, n, s));

    }
}
