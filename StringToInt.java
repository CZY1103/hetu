public class StringToInt {
    public static int myAtoi(String s) {
        char[] c = s.toCharArray();
        Integer n = 0;
        char m = 0;
        for (int i = 0;i < c.length;i++){
            if (c[i]=='-'||c[i]=='+'){
                 m = c[i];
            }
            if (c[i]>='0'&&c[i]<='9'){
                n = n*10+(c[i]-'0');
            }
        }
        if (m=='-'){
            n = n*(-1);
        }
        return n;
    }

    public static void main(String[] args) {
        String s = "words and 123";
        System.out.println(myAtoi(s));
    }
}
