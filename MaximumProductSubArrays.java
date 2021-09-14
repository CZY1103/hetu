public class MaximumProductSubArrays {
    public static double max(double a,double b,double c,double d){
        return Math.max(d,Math.max(a,Math.max(b,c)));
    }
    public static double min(double a,double b,double c,double d){
        return Math.min(d,Math.min(a,Math.min(b,c)));
    }
    public double maxProduct(double[] arr) {
        int m = arr.length;
        if(m == 0){
            return 0;
        }
        //mx[i]表示从0到i位置数组的最大乘积
        double[] mx = new double[m];
        double[] mn = new double[m];
        mx[0]=mn[0]=arr[0];
        for(int i = 1; i < m;i++){
            mx[i]=max(arr[i],arr[i]*mx[i-1],arr[i]*mn[i-1],arr[i]);
            mn[i] = min(arr[i],arr[i]*mx[i-1],arr[i]*mn[i-1],arr[i]);
        }
        double res = mx[0];
        for(int i = 1;i < m;i++){
            if(mx[i]>res){
                res = mx[i];
            }
        }
        return res;
    }
}
