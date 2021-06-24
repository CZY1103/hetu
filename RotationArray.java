public class RotationArray {
    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
        int i = 0;
        while(m>0){
            int s = a[n-1];
            for( i = n-1;i > 0;i--){
                a[i]=a[i-1];
            }
            a[0]=s;
            m--;
        }
        return a;
    }
}
