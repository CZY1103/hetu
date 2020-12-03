public class IntTOString {
    public String intToString(int n){
        String s = String.valueOf(n);

        int i = s.length()-1;
        String m = s;
        int j = 0;
        for(i=s.length() - 1;i>=0;i--){
            m.charAt(j)=s.charAt(i);
        }
        return m;
    }
}
