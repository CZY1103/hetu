import com.sun.deploy.ref.AppModel;

import java.util.Arrays;

public class ShellSort {
    public static int[] myShellSort(int[] arr){
        int gap = arr.length/2;
        while(true){
            insertSortGap(arr,gap);
            if (gap==1){
                break;
            }
            gap = gap/2;
        }
        return arr;
    }
    public static void insertSortGap(int[] arr,int gap){
        for (int i = gap;i < arr.length;i++){
            int key = arr[i];
            int j = 0;
            for (j = i-gap;j>=0;j = j-gap){
                if (arr[j]>key){
                    arr[j+gap] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(myShellSort(arr)));
    }
}
