import java.util.Arrays;

public class ArrayElementExchange {
    public static int bigest(int[] a,int s){
        int[] b = new int[a.length];
        for(int i = 0;i< b.length;i++){
            b[i]=a[i];
        }
        Arrays.sort(b);
        int x = b[a.length-s];
        for(int i = 0;i < a.length;i++){
            if(x==a[i]){
                return i;
            }
        }
        return 0;
    }
    public int[] sovle (int[] a, int n, int m) {
        int in = bigest(a,n);
        int im = bigest(a,m);
        int s = a[in];
        a[in] = a[im];
        a[im] = s;
        return a;
    }
}
