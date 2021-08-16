import java.util.ArrayList;
import java.util.Arrays;

public class MinimumKNumber {
    //排序
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(input);
//        for(int i = 0 ;i < k;i++){
//            list.add(input[i]);
//        }
//        return list;
//    }
    /**
     * 堆
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> res = new ArrayList<>();
        if (input==null || input.length==0||k>input.length||k==0){
            return res;
        }
        int[] arr = new int[k];
        for (int i = 0 ;i < k;i++){
            arr[i] = input[i];
        }
        heap(arr,k);
        for (int i = k ;i < input.length;i++){
            if (arr[0]>input[i]){
                arr[0]=input[i];
                adjustDown(arr,0,k);
            }
        }
        for (int i = 0;i < arr.length;i++){
            res.add(arr[i]);
        }
        return res;
    }
    public static void heap(int[] arr,int size){
        if (arr==null|arr.length==0){
            return;
        }
        for (int i = size/2;i>=0;i--){
            adjustDown(arr,i,arr.length);
        }
    }

    private static void adjustDown(int[] arr, int index, int length) {
        while(2*index+1<length){
            int m = 2*index+1;
            if (m+1<length && arr[m]<arr[m+1]){
                m = m+1;
            }
            if (arr[m]<=arr[index]){
                break;
            }
            int temp = arr[index];
            arr[index] = arr[m];
            arr[m] = temp;
            index = m;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(arr, 4));

    }
}
