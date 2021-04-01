public class JundgeString {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] childString = new boolean[n];
        for(int i = 0; i < n;i++){
            childString[i] = s.contains(p[i]);
        }
        return childString;
    }
}
