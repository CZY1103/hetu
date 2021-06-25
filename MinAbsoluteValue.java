import java.util.Arrays;
public class MinAbsoluteValue{
    public static int minDifference (int[] a) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i = 1;i <= a.length-1;i++){
            int s = a[i]-a[i-1];
            int m = 0;
            if (s<=Integer.MIN_VALUE){
                m = res;
            }else if(s < 0&&s>Integer.MIN_VALUE) {
                m = s*(-1);
            }else{
                m = s;
            }
            if(m <= res){
                res =m;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {-2147483648,0,2147483647};
        System.out.println(minDifference(a));
    }
}
