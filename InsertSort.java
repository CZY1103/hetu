import java.util.Arrays;

public class InsertSort {
    public static int[] myInsertSort(int[] arr){
        //有序区间：[0,i]
        //无序区间：[i+1,arr.length-1]
        for (int i = 0;i < arr.length-1;i++){
            int ket = arr[i+1];
            int j = 0;
            for ( j = i;j>=0;j--){
                if (ket<arr[j]){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=ket;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,6,4,9,7};
        System.out.println(Arrays.toString(myInsertSort(arr)));
    }
}
