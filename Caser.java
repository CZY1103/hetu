public class Caser {
    public static char charJust(int n){
        if(n>=0&&n<=9){
            return (char)(n+'0');
        }else if(n>=10&&n<36){
            return (char)(n+'7');
        }else{
            return (char)(n+'=');
        }
    }
    public static int NumberJust(char ch){
        if(ch>='0'&&ch<='9'){
            return ch-'0';
        }else if(ch>='A'&&ch<='Z'){
            return ch-'7';
        }else{
            return ch-'=';
        }
    }
    public static String decode (String str, int d) {
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < ch.length;i++){
            int s = NumberJust(ch[i]);
            s = (s-d)%62;
            if(s<0){
                s=s+62;
            }
            sb.append(charJust(s));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str ="123ABCabc";
        System.out.println(decode(str,3));
    }
}
