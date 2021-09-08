public class KMPAlgorithm {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算模板串S在文本串T中出现了多少次
     * @param S string字符串 模板串
     * @param T string字符串 文本串
     * @return int整型
     */
    public int kmp (String S, String T) {
        //特殊情况判断
        int m = S.length();
        int n = T.length();
        if(m>n||n==0){
            return 0;
        }
        int cns = 0;
        int[] next = getNext(S);
        //遍历主串和模式串
        for(int i = 0,j = 0;i < n;i++){
            //只要不相等，回退到next数组记录的下一位
            while(j >0&&T.charAt(i)!=S.charAt(j)){
                j = next[j-1];
            }
            if(T.charAt(i)==S.charAt(j)){
                j++;
            }
            if(j==m){
                cns++;
                j = next[j-1];
            }
        }
        return cns;
    }
    //确定next数组
    public static int[] getNext(String S){
        int m = S.length();
        int[] next = new int[m];
        for(int i = 1,j = 0;i < m;i++){
            //只要不相等，回退到next数组记录的下一位
            while(j>0&&S.charAt(i)!=S.charAt(j)){
                j = next[j-1];
            }
            //前缀索引后移
            if(S.charAt(i)==S.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    /**
     * 时间复杂度较大
     * O((n-m)*m)
     */
//    public int kmp (String S, String T) {
//        int m = S.length();
//        int n = T.length();
//        if(m>n||n==0){
//            return 0;
//        }
//        int cns = 0;
//        for(int i = 0,j = 0;i < n;i++){
//            while(j>0&&T.charAt(i)!=S.charAt(j)){
//                j=0;
//            }
//            if(T.charAt(i)==S.charAt(j)){
//                j++;
//            }
//            if(j==m){
//                cns++;
//                i = i-j+2;
//                j = 0;
//            }
//        }
//        return cns;
//    }
}
