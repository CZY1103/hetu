public class NiuPrimeNumbers {
        /**
         * 返回两个区间内各取一个值相乘是p的倍数的个数
         * @param a int整型 第一个区间的左边界
         * @param b int整型 第一个区间的右边界
         * @param c int整型 第二个区间的左边界
         * @param d int整型 第二个区间的右边界
         * @param p int整型 质数
         * @return long长整型
         */
        public long numbers (int a, int b, int c, int d, int p) {
            long m = a%p!=0?b/p-a/p:b/p-a/p+1;
            long n = c%p!=0?d/p-c/p:c/p-c/p+1;
            return m*(d-c+1)+n*(b-a+1)-m*n;
        }
}
