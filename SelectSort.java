import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序
     * @param arr 需要排序的数组
     * @return 排序后的数组
     */
    public static int[] mySelectSort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            //无序区间[0,arr.length-i)
            //有序区间[arr.length-i,array.length)
            int maxIndex = 0;
            //找到无需区间最大数的下标
            for (int j = 1;j < arr.length-i;j++){
                if (arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            //把无序区间的最大数和无序区间最后一个数进行交换
            int m = arr[maxIndex];
            arr[maxIndex] = arr[arr.length-i-1];
            arr[arr.length-i-1] =m;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,49,7};
        System.out.println(Arrays.toString(mySelectSort(arr)));
    }
}
