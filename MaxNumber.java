public class MaxNumber {
    public static  int solve (String s) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)>'F'){
                if(sum > max){
                    max = sum;
                }
                sum = 0;
                continue;
            }
            int x =(s.charAt(i)>='A')?10+s.charAt(i)-'A':s.charAt(i)-'0';
            sum = sum*16+x;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve(
                "UR11645E64O45CACC1GR1560C303X1A24CDCBYLX1616D491I"
        ));
    }
}
