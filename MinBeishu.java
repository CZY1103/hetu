public class MinBeishu {
    public int maxBeishu(int m,int n){
        int M = m;
        int N = n;
        int r = 0;
        while(n!=0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m*(M/m)*(N/m);
    }
}
