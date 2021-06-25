public class MathematicsExperiment {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param n long长整型 老师给牛牛的数字
     * @return int整型
     */
    public static int mathexp (long n) {
        if(n<10){
            return (int)n;
        }
        int l = Integer.MAX_VALUE;
        long m = 0;
        while(l!=1) {
            int i = 0;
            String str = String.valueOf(n);
            char[] ch = str.toCharArray();
            n = Long.parseLong(String.valueOf(ch[i]));//字符类型转为长整型
            for ( i = 1;i < ch.length;i++){
                n = n*Long.parseLong(String.valueOf(ch[i]));
            }
            if(n==m){
                return (int)n;
            }
            l = ch.length;
            m = n;
        }
        return (int)n;
    }
    public static void main(String[] args) {
        System.out.println(mathexp(999));
    }
}
