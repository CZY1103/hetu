public class HexadecimalConversion {
    public static String solve (int M, int N) {
        if(M==0){
            return "0";
        }
        String s = "0123456789ABCDEF";
        StringBuffer sb = new StringBuffer();
        boolean f = false;
        if(M<0){
            f = true;
            M = -M;
        }
        char n = 0;
        while(M!=0){
            n = s.charAt(M%N);
            M = M/N;
            sb.append(n);
        }
        if(f){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solve(-7,2));
    }
}
