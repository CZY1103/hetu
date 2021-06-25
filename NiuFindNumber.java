public class NiuFindNumber {
    /**
     * 给定两个数a和b，返回大于a且为b的倍数的最小整数。​
     * @param a int整型 代表题目中描述的a
     * @param b int整型 代表题目中描述的b
     * @return int整型
     */
    public int findNumber (int a, int b) {
        int m = 0;
        int i = 1;
        while(i<=Integer.MAX_VALUE && m <=Integer.MAX_VALUE && m <=a){
            m = i*b;
            if(m<=a){
                i++;
            }
        }
        return m;
    }
}
