public class StringDeformation {
    public static String trans(String s, int n) {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0 ;i < n;i++){
            char c = s.charAt(i);
            if (c>='A'&&c<='Z'){
                c = (char) (c+32);
            }else if (c>='a'&&c<='z'){
                c = (char) (c-32);
            }
            sbf.append(c);
        }
        String[] ch = sbf.toString().split(" ");
        StringBuffer sb = new StringBuffer();
        if (sbf.charAt(n-1)==' '){
            sb.append(" ");
        }
        for (int i = ch.length-1;i>0;i--) {
            sb.append(ch[i]+" ");
        }
        sb.append(ch[0]);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="h i ";
        System.out.println(trans(s,4));
    }
}
