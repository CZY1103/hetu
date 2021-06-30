import java.util.Arrays;

public class NearAndDistant {
    public static int getRes(int[] arr,int m){
        int near = Math.min(Math.abs(arr[0]-m),Math.abs(arr[arr.length-1]-m));
        int i = 0;
        int j = arr.length-1;
        int mid = (i+j)/2;
        near = Math.abs(Math.min(Math.abs(arr[mid]-m),near));
        while(i<j){
            if(arr[mid]<m){
                i = mid+1;
            }else if(arr[mid]>m){
                j = mid-1;
            }else{
                return 0;
            }
            mid = (i+j)/2;
            near = Math.abs(Math.min(Math.abs(arr[mid]-m),near));
        }
        near = Math.abs(Math.min(near,Math.abs(arr[i]-m)));
        return near;
    }
    public static int[] solve (int n, int m, int[] a, int[] x) {
        Arrays.sort(a);
        int[] res = new int[m];
        for(int i = 0 ;i < m;i++){
            res[i] = getRes(a,x[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve(3,2,new int[]{2,4,7}, new int[]{5, 8}));
    }
}
